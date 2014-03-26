package easigreen.service;

import easigreen.system.*;
import java.util.ArrayList;

/**
 * The sim city is the main class of the application.  It uses the user
 * interface to communicate with the user, uses the simulator to process the
 * data, and uses the CSV getter to create and access files containing saved
 * changes.
 *
 * @see java.util.ArrayList
 *
 * @version 0.1.1
 * @author Larson Caldwell
 * @author Sam Graham
 * @author Haru McClellan
 */
public class SimCity
{
    //////////////////// Variables

    /**
     * Manager for the energy
     */
    private EnergyManager mEnergyManager;
	
    /**
     * Manager for the upgrades.
     */
    private UpgradeManager mUpgradeManager;
    
    /**
     * Manager for the goals
     */
    private GoalManager mGoalManager;

    /**
     * Manager for the world
     */
    private WorldManager mWorldManager;

    /**
     * Manager for the resources
     */
    private ResourceManager mResourceManager;
	
    /**
     * Manager for the trades
     */
    private TradeManager mTradeManager;

    /**
     * Manager for base values
     */
    private BaseManager mBaseManager;

    //////////////////// Methods

    /**
     * This method will run the program.  It will listen to the user and call
     * algorithms in the simulators.
     */
    public void init()
    {
	mWorldManager    = new WorldManager   ();
	mBaseManager     = new BaseManager    ();
	mUpgradeManager  = new UpgradeManager ();
	mEnergyManager   = new EnergyManager  (mUpgradeManager);
	mResourceManager = new ResourceManager(mBaseManager    , mUpgradeManager);
	mTradeManager    = new TradeManager   (mResourceManager, mUpgradeManager);
	mGoalManager     = new GoalManager    (mResourceManager, mUpgradeManager, mEnergyManager);
    }

    /**
     * Main starts the run method
	 * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        new SimCity().init();
    }

    public BaseManager     getBaseManager    () {return mBaseManager    ;}
    public EnergyManager   getEnergyManager  () {return mEnergyManager  ;}
    public UpgradeManager  getUpgradeManager () {return mUpgradeManager ;}
    public GoalManager     getGoalManager    () {return mGoalManager    ;}
    public WorldManager    getWorldManager   () {return mWorldManager   ;}
    public ResourceManager getResourceManager() {return mResourceManager;}
    public TradeManager    getTradeManager   () {return mTradeManager   ;}

    public void setBaseManager    (BaseManager     pBaseManager    ) {mBaseManager     = pBaseManager    ;}
    public void setEnergyManager  (EnergyManager   pEnergyManager  ) {mEnergyManager   = pEnergyManager  ;}
    public void setUpgradeManager (UpgradeManager  pUpgradeManager ) {mUpgradeManager  = pUpgradeManager ;}
    public void setGoalManager    (GoalManager     pGoalManager    ) {mGoalManager     = pGoalManager    ;}
    public void setWorldManager   (WorldManager    pWorldManager   ) {mWorldManager    = pWorldManager   ;}
    public void setResourceManager(ResourceManager pResourceManager) {mResourceManager = pResourceManager;}
    public void setTradeManager   (TradeManager    pTradeManager   ) {mTradeManager    = pTradeManager   ;}
}
