package easigreen.service;

import easigreen.service.*;
import easigreen.system.*;

/**
 * The RenewableManager Manages Renewable Energy
 *
 * @version 0.1.0
 * @author Larson Caldwell
 * @author Sam Graham
 * @author Haru McClellan
 */
public class RenewableManager extends PlantManager
{
    //////////////////// Variables
	
    public RenewableManager(UpgradeManager pUpgradeManager)
    {
	super(pUpgradeManager);
	mPlant = new Renewable();
    }

    public double getCostRemove()
    {
	return mPlant.getCostRemove();
    }

    public double getCostBuild()
    {
	return mPlant.getCostBuild() + mUpgrades.getRenewableCost();
    }    

    public double getApproval()
    {
	return mPlant.getApproval() + mUpgrades.getRenewableApproval();
    }

    public double getTotalApproval()
    {
	return getApproval() * (double)getAmount();
    }

    public double getPower()
    {
	return mPlant.getPower() + mUpgrades.getRenewablePower();
    }

    public double getTotalPower()
    {
	return getPower() * (double)getAmount();
    }

    public double getEmissions()
    {
	return mPlant.getEmissions() + mUpgrades.getRenewableEmissions();
    }

    public double getTotalEmissions()
    {
	return getEmissions() * (double)getAmount();
    }

    public double getSecurity()
    {
	return mPlant.getSecurity() + mUpgrades.getRenewableSecurity();
    }

    public double getTotalSecurity()
    {
	return getSecurity() * (double)getAmount();
    }

    public double getProfit()
    {
	return mPlant.getProfit() + mUpgrades.getRenewableProfit();
    }

    public double getTotalProfit()
    {
	return getProfit() * (double)getAmount();
    }
}
