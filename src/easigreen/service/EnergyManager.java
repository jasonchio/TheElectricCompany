package easigreen.service;

import easigreen.service.*;
import easigreen.system.*;

/**
 * The EnergyManager Manages Energy
 *
 * @version 0.1.0
 * @author Larson Caldwell
 * @author Sam Graham
 * @author Haru McClellan
 */
public class EnergyManager
{
    //////////////////// Variables

    /**
     * The Manager of upgrades
     */
    private UpgradeManager mUpgradeManager;

    /**
     * The Manager of upgrades
     */
    private UpgradeMerger mUpgrades;
	
    /**
     * The Nuclear Plant Manager
     */
    private PlantManager mNuclear;
	
    /**
     * The Fossil Plant Manager
     */
    private PlantManager mFossil;
    
    /**
     * The Renewable Plant Manager
     */
    private PlantManager mRenewable;
	
    /**
     * The Oil Manager
     */
    private OilManager mOil;

    public EnergyManager(UpgradeManager pUpgradeManager)
    {
	mUpgradeManager = pUpgradeManager;
	mNuclear        = new NuclearManager  (mUpgradeManager);
	mFossil         = new FossilManager   (mUpgradeManager);
	mRenewable      = new RenewableManager(mUpgradeManager);
	mOil            = new OilManager      (mUpgradeManager);
	update();
    }

    public void update()
    {
	mUpgrades = mUpgradeManager.update();
	mNuclear  .update();
	mFossil   .update();
	mRenewable.update();
	mOil      .update();
    }

    public PlantManager getNuclear()
    {
	return mNuclear;
    }

    public PlantManager getFossil()
    {
	return mFossil;
    }

    public PlantManager getRenewable()
    {
	return mRenewable;
    }

    public OilManager getOil()
    {
	return mOil;
    }

    public double getEmissions()
    {
	return mNuclear.getTotalEmissions() + mFossil.getTotalEmissions()
	    + mRenewable.getTotalEmissions() + mOil.getEmissions();
    }

    public double getSecurity()
    {
	return mNuclear.getTotalSecurity() + mFossil.getTotalSecurity()
	    + mRenewable.getTotalSecurity() + mOil.getSecurity();
    }

    public double getAmount()
    {
	return mNuclear.getAmount() + mFossil.getAmount() + mRenewable.getAmount();
    }

    public double getApproval()
    {
	return ((mNuclear.getApproval() + mFossil.getApproval() + mRenewable.getApproval()) / 3);
    }

    public double getPower()
    {
	return mNuclear.getPower() + mFossil.getPower() + mRenewable.getPower();
    }

    public double getProfit()
    {
	return mNuclear.getProfit() + mFossil.getProfit() + mRenewable.getProfit();
    }
}
