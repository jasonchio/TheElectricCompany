package easigreen.service;

import easigreen.service.*;
import easigreen.system.*;

/**
 * The Oil Manager Manages Oil
 *
 * @version 0.1.0
 * @author Larson Caldwell
 * @author Sam Graham
 * @author Haru McClellan
 */
public class OilManager
{
    //////////////////// Variables

    /**
     * The Manager of upgrades
     */
    private UpgradeManager mUpgradeManager;

    /**
     * The actual upgrades
     */
    private UpgradeMerger mUpgrades;
	
    /**
     * The Oil Object
     */
    private Oil mOil;
	
    public OilManager(UpgradeManager pUpgradeManager)
    {
	mUpgradeManager = pUpgradeManager;
	mOil = new Oil();
	update();
    }

    public void update()
    {
	mUpgrades = mUpgradeManager.update();
    }

    public double getConsumption()
    {
	return mOil.getConsumption() + mUpgrades.getOilConsumption();
    }

    public double getGrowth()
    {
	return mOil.getGrowth() + mUpgrades.getOilGrowth();
    }

    public double getEmissions()
    {
	return mOil.getEmissions() * mOil.getConsumption();
    }

    public double getSecurity()
    {
	return mOil.getSecurity() + mUpgrades.getOilSecurity();
    }

    public double getTotalSecurity()
    {
	return getSecurity() * getConsumption();
    }
}
