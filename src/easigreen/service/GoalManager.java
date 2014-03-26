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


}
