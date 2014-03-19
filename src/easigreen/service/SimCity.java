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
     * The round number
     */
    private int roundNumber;    

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

    //////////////////// Methods

    /**
     * This method will run the program.  It will listen to the user and call
     * algorithms in the simulators.
     */
    public void run()
    {
	mResourceManager = new ResourceManager();
	mUpgradeManager = new UpgradeManager(mResourceManager);
	mEnergyManager = new EnergyManager(mUpgradeManager);
	mGoalManager = new GoalManager(mEnergyManager, mResourceManager,
                                       mUpgradeManager);
	mWorldManager = new WorldManager();
	mTradeManager = new TradeManager(mUpgradeManager.getTechnologyManager(), 
                                         mResourceManager);
    }

    /**
     * Main starts the run method
	 * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        new SimCity().run();
    }
}
