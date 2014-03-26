package easigreen.service;

import easigreen.service.*;
import easigreen.system.*;

/**
 * The NuclearManager Manages Nuclear Energy
 *
 * @version 0.1.0
 * @author Larson Caldwell
 * @author Sam Graham
 * @author Haru McClellan
 */
public class NuclearManager extends PlantManager
{
    //////////////////// Variables
	
    public NuclearManager(UpgradeManager pUpgradeManager)
    {
	super(pUpgradeManager);
	mPlant = new Nuclear();
    }

    public double getCostRemove()
    {
	return mPlant.getCostRemove();
    }

    public double getCostBuild()
    {
	return mPlant.getCostBuild() + mUpgrades.getNuclearCost();
    }    

    public double getApproval()
    {
	return mPlant.getApproval() + mUpgrades.getNuclearApproval();
    }

    public double getTotalApproval()
    {
	return getApproval() * (double)getAmount();
    }

    public double getPower()
    {
	return mPlant.getPower() + mUpgrades.getNuclearPower();
    }

    public double getTotalPower()
    {
	return getPower() * (double)getAmount();
    }

    public double getEmissions()
    {
	return mPlant.getEmissions() + mUpgrades.getNuclearEmissions();
    }

    public double getTotalEmissions()
    {
	return getEmissions() * (double)getAmount();
    }

    public double getSecurity()
    {
	return mPlant.getSecurity() + mUpgrades.getNuclearSecurity();
    }

    public double getTotalSecurity()
    {
	return getSecurity() * (double)getAmount();
    }

    public double getProfit()
    {
	return mPlant.getProfit() + mUpgrades.getNuclearProfit();
    }

    public double getTotalProfit()
    {
	return getProfit() * (double)getAmount();
    }
}
