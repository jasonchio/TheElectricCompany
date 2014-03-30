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
     * The upgrades
     */
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

    //////////////////// Constructor

    /**
     * All the array lists are set up and wired to the upgrade manager.
     *
     * @param pUpgradeManager the upgrade manager
     */
    public EnergyManager(UpgradeManager pUpgradeManager)
    {
        mUpgradeManager = pUpgradeManager;
        mNuclear        = new NuclearManager  (mUpgradeManager);
        mFossil         = new FossilManager   (mUpgradeManager);
        mRenewable      = new RenewableManager(mUpgradeManager);
        mOil            = new OilManager      (mUpgradeManager);
	update();
    }

    /**
     * Gets the nuclear plants
     *
     * @return mNuclear the nuclear plants
     */
    public NuclearManager getNuclear()
    {
        return mNuclear;
    }

    /**
     * Gets the fossil plants
     *
     * @return mFossil the fossil plants
     */
    public FossilManager getFossil()
    {
        return mFossil;
    }

    /**
     * Gets the renewable plants
     *
     * @return mRenewable the renewable plants
     */
    public RenewableManager getRenewable()
    {
        return mRenewable;
    }

    /**
     * Gets the oil data
     *
     * @return mOil the oil data
     */
    public OilManager getOil()
    {
        return mOil;
    }

    /**
     * Applies upgrade and technology effects to the plants and oil
     */
    public void update()
    {
	mUpgrades = mUpgradeManager.update();
    }


    /**
     * Gets the total power produced with all the plants together
     */
    public double getPower()
    {
	return mNuclear.getTotalPower() + mFossil.getTotalPower() + mRenewable.getTotalPower();
    }

    /**
     * Gets the security of all the plants together
     */
    public double getSecurity()
    {
	return mNuclear.getTotalSecurity() + mFossil.getTotalSecurity() +
	    mRenewable.getTotalSecurity() + mOil.getSecurity();
    }

    /**
     * Gets the amount of all the plants together
     */
    public int getAmount()
    {
	return mNuclear.getAmount() + mFossil.getAmount() 
           + mRenewable.getAmount();
    }

    /**
     * Gets the approval of all the plants together
     */
    public double getApproval()
    {
	return ((mNuclear.getApproval() + mFossil.getApproval() 
           + mRenewable.getApproval()) / (double)getAmount());
    }

    /**
     * Gets the emissions of all the plants together
     */
    public double getEmissions()
    {
	return mNuclear.getTotalEmissions() + mFossil.getTotalEmissions() + 
	    mRenewable.getTotalEmissions() + mOil.getEmissions();
    }

    /**
     * Gets the security of all the plants together
     */
    public double getProfit()
    {
	return mNuclear.getTotalProfit() + mFossil.getTotalProfit() 
           + mRenewable.getTotalProfit();
    }
}
