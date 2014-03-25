package easigreen.service;

/**
 * The EnergyManager Manages Energy
 *
 * @version 0.1.0
 * @author Larson Caldwell
 * @author Sam Graham
 * @author Haru McClellan
 */
public class EnergyManager
{
    //////////////////// Variables

        /**
	 * The Manager of upgrades
	 */
	private UpgradeManager mUpgradeManager;

    /**
     * The manager of Technologies
     */
    private TechnologyManager mTechnologyManager;
	
	/**
	 * The Nuclear Plant Object
	 */
	private Energy mNuclear;
	
	/**
	 * The Fossil Plant Object
	 */
	private Energy mFossil;
	
	/**
	 * The Renewable Plant Object
	 */
	private Energy mRenewable;
	
	/**
	 * The Oil Object
	 */
	private Oil mOil;
	
    public EnergyManager(UpgradeManager pUpgradeManager, 
                         TechnologyManager pTechnologyManager)
	{
           mUpgradeManager = pUpgradeManager;
	   mTechnologyManager = pTechnologyManager;
	   mNuclear        = new Nuclear();
	   mFossil         = new Fossil();
	   mRenewable      = new Renewable();
	   mOil            = new Oil();
	}

    public UpgradeManager getUpgradeManager() {return mUpgradeManager;}
    public Energy getNuclear() {return mNuclear;}
    public Energy getFossil() {return mFossil;}
    public Energy getRenewable() {return mRenewable;}
    public Oil getOil() {return mOil;}

    public void update()
    {
	UpgradeMerger technologyMerger = new UpgradeMerger();

	UpgradeMerger upgradeMerger = new UpgradeMerger();

        technologyMerger = mTechnologyManager.update();

        upgradeMerger = mUpgradeManager.update();

        mNuclear.setApproval(mNuclear.getApproval() 
                             + technologyMerger.getNatt() 
                             + upgradeMerger.getNatt());

	mNuclear.setSecurity(mNuclear.getSecurity() 
                             + technologyMerger.getNsec()
                             + upgradeMerger.getNsec());

        mFossil.setApproval(mFossil.getApproval() 
                            + technologyMerger.getFatt()
                            + upgradeMerger.getFatt());

	mFossil.setSecurity(mFossil.getSecurity() 
                            + technologyMerger.getFsec()
                            + upgradeMerger.getFsec());

	mRenewable.setApproval(mRenewable.getApproval()
                               + technologyMerger.getRatt()
                               + upgradeMerger.getRatt());

        mRenewable.setSecurity(mRenewable.getSecurity()
                               + technologyMerger.getRsec()
                               + upgradeMerger.getRsec());

        mOil.setGrowth(mOil.getGrowth() 
                       + technologyMerger.getOilGrow() 
                       + upgradeMerger.getOilGrow());

	mOil.setSecurity(mOil.getSecurity()
			    + technologyMerger.getOilSec()
			    + upgradeMerger.getOilSec());
    }
}