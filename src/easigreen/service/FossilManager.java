package easigreen.service;

import easigreen.service.*;
import easigreen.system.*;

/**
 * The FossilManager Manages Fossil Energy
 *
 * @version 0.1.0
 * @author Larson Caldwell
 * @author Sam Graham
 * @author Haru McClellan
 */
public class FossilManager extends PlantManager
{
    //////////////////// Variables
	
    public FossilManager(UpgradeManager pUpgradeManager)
    {
	super(pUpgradeManager);
	mPlant = new Fossil();
    }

    public double getCostRemove()
    {
	return mPlant.getCostRemove();
    }

    public double getCostBuild()
    {
	return mPlant.getCostBuild() + mUpgrades.getFossilCost();
    }    

    public double getApproval()
    {
	return mPlant.getApproval() + mUpgrades.getFossilApproval();
    }

    public double getTotalApproval()
    {
	return getApproval() * (double)getAmount();
    }

    public double getPower()
    {
	return mPlant.getPower() + mUpgrades.getFossilPower();
    }

    public double getTotalPower()
    {
	return getPower() * (double)getAmount();
    }

    public double getEmissions()
    {
	return mPlant.getEmissions() + mUpgrades.getFossilEmissions();
    }

    public double getTotalEmissions()
    {
	return getEmissions() * (double)getAmount();
    }

    public double getSecurity()
    {
	return mPlant.getSecurity() + mUpgrades.getFossilSecurity();
    }

    public double getTotalSecurity()
    {
	return getSecurity() * (double)getAmount();
    }

    public double getProfit()
    {
	return mPlant.getProfit() + mUpgrades.getFossilProfit();
    }

    public double getTotalProfit()
    {
	return getProfit() * (double)getAmount();
    }
}
