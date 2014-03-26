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

    private UpgradeMerger mUpgrades;

    /**
     * The Nuclear Plant Object
     */
    private NuclearManager mNuclear;

    /**
     * The Fossil Plant Object
     */
    private FossilManager mFossil;

    /**
     * The Renewable Plant Object
     */
    private RenewableManager mRenewable;

    /**
     * The Oil Object
     */
    private OilManager mOil;

    public EnergyManager(UpgradeManager pUpgradeManager)
    {
        mUpgradeManager = pUpgradeManager;
        mNuclear        = new NuclearManager  (mUpgradeManager);
        mFossil         = new FossilManager   (mUpgradeManager);
        mRenewable      = new RenewableManager(mUpgradeManager);
        mOil            = new OilManager      (mUpgradeManager);
	update();
    }

    public NuclearManager getNuclear()
    {
        return mNuclear;
    }

    public FossilManager getFossil()
    {
        return mFossil;
    }

    public RenewableManager getRenewable()
    {
        return mRenewable;
    }

    public OilManager getOil()
    {
        return mOil;
    }

    public void update()
    {
	mUpgrades = mUpgradeManager.update();
    }

    public double getPower()
    {
	return mNuclear.getTotalPower() + mFossil.getTotalPower() + mRenewable.getTotalPower();
    }

    public double getSecurity()
    {
	return mNuclear.getTotalSecurity() + mFossil.getTotalSecurity() +
	    mRenewable.getTotalSecurity() + mOil.getSecurity();
    }

    public int getAmount()
    {
	return mNuclear.getAmount() + mFossil.getAmount() + mRenewable.getAmount();
    }

    public double getApproval()
    {
	return ((mNuclear.getApproval() + mFossil.getApproval() + mRenewable.getApproval()) / (double)getAmount());
    }

    public double getEmissions()
    {
	return mNuclear.getTotalEmissions() + mFossil.getTotalEmissions() + 
	    mRenewable.getTotalEmissions() + mOil.getEmissions();
    }

    public double getProfit()
    {
	return mNuclear.getTotalProfit() + mFossil.getTotalProfit() + mRenewable.getTotalProfit();
    }
}
