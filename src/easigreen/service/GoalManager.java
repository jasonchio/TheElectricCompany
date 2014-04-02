package easigreen.service;

/**
 * The GoalManager Manages Goals
 *
 * @version 0.1.2
 * @author Larson Caldwell
 * @author Sam Graham
 * @author Haru McClellan
 */
public class GoalManager
{
    //////////////////// Variables

    /**
     * Manager of Energy
     */
    private EnergyManager mEnergyManager;

    /**
     * Manager of Resources
     */
    private ResourceManager mResourceManager;


    /**
     * Manager of Upgrades
     */
    private UpgradeManager mUpgradeManager;

    /**
     * Needed approval rating
     */
    private static final int mTargetApproval = 45;

    /**
     * The Emissions Target
     */
    private double mEmissions;

    /**
     * The Security Target
     */
    private double mSecurity;

    /**
     * The Profit Target
     */
    private double mProfit;

    ///////////////////// Getter

    public int getTargetApproval()
    {
        return mTargetApproval;
    }

    ///////////////////// Constructor

    /**
     * The Constructor for this class
     *
     * @param pEnergyManager the energy manager
     * @param pResourceManager the resource manager
     * @param pUpgradeManager the upgrade manager
     */
    public GoalManager(ResourceManager pResourceManager, UpgradeManager pUpgradeManager, EnergyManager pEnergyManager)
    {
        mEnergyManager   = pEnergyManager;
        mResourceManager = pResourceManager;
        mUpgradeManager  = pUpgradeManager;
    }

    /**
     * Updates Target Goals to last rounds
     */
    public void update()
    {
	mEmissions = mEnergyManager.getEmissions() - mResourceManager.getEmitCredits();
	mSecurity  = mEnergyManager.getSecurity();
	mProfit    = mEnergyManager.getProfit();
	update();
    }

    /**
     * Returns the last rounds Emissions
     * @return mEmissions
     */
    public double getTargetEmissions()
    {
	return mEmissions;
    }

    /**
     * Returns the last rounds security
     * @return mSecurity the last rounds security
     */
    public double getTargetSecurity()
    {
	return mSecurity;
    }

    /**
     * Returns the last rounds profit
     * @return mProfit the last rounds profit
     */
    public double getTargetProfit()
    {
	return mProfit;
    }
}
