package easigreen.service;

import java.lang.Math;

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
	mEmissions = .8  * mEnergyManager.getEmissions() - mResourceManager.getEmitCredits();
	mSecurity  = Math.abs(.4 * mEnergyManager.getSecurity()) + mEnergyManager.getSecurity();
	mProfit    = Math.abs(.1 * mEnergyManager.getProfit()) + mEnergyManager.getProfit();
	//update();  //this is recusive and sends the program in an endless loop
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
