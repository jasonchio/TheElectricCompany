package easigreen.service;

import easigreen.service.*;
import easigreen.system.*;

/**
 * The PlantManager Manages Power Plants
 *
 * @version 0.1.0
 * @author Larson Caldwell
 * @author Sam Graham
 * @author Haru McClellan
 */
public abstract class PlantManager
{
    //////////////////// Variables

    /**
     * The Manager of upgrades
     */
    protected UpgradeManager mUpgradeManager;

    /**
     * The actual upgrades
     */
    protected UpgradeMerger mUpgrades;
	
    /**
     * The Plant Object
     */
    protected Energy mPlant;
	
    public PlantManager(UpgradeManager pUpgradeManager)
    {
	mUpgradeManager = pUpgradeManager;
	update();
    }

    public void update()
    {
	mUpgrades = mUpgradeManager.update();
    }

    public void add(int num)
    {
	mPlant.add(num);
    }

    public void remove(int num)
    {
	mPlant.remove(num);
    }

    public int getAmount()
    {
	return mPlant.getAmount();
    }

    public abstract double getCostBuild     ();
    public abstract double getCostRemove    ();
    public abstract double getApproval      ();
    public abstract double getTotalApproval ();
    public abstract double getPower         ();
    public abstract double getTotalPower    ();
    public abstract double getEmissions     ();
    public abstract double getTotalEmissions();
    public abstract double getSecurity      ();
    public abstract double getTotalSecurity ();
    public abstract double getProfit        ();
    public abstract double getTotalProfit   ();
}
