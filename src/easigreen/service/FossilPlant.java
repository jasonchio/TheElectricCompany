package easigreen.service;

import easigreen.system.*;

/**
 * This class contains the default values for an unmodified fossil plant.  It
 * will assign these values unless they are passed into the constructor.
 *
 * @version 0.1.1
 * @author Larson Caldwell
 * @author Sam Graham
 * @author Haru McClellan
 */
public class FossilPlant
   extends Plant
{
    //////////////////// Constructors
   
    /**
     * Sets default values to a fossil plant.
     */
    public FossilPlant()
    {
	mAmount = 100;
	mCostBuild = 1;
	mCostRemove = .1;
	mApproval = 50;
	mProduction = .65;
	mEmissions = 2;
	mSecurity = .09;
	mProfitPercent = 45;
    }

    /**
     * Sets passed values to a fossil plant.
     *
     * @param pAmount number of plants
     * @param pCost cost of each new plant
     * @param pApproval approval rating per unit
     * @param pProduction power production per unit
     * @param pEmissions emissions produced per unit
     * @param pSecurity the security of each unit
     * @param pProfitPercent the profit made with each unit
     */
    public FossilPlant(int pAmount, double pCostBuild, double pCostRemove,
		       double pApproval, double pProduction, double pEmissions, 
		       double pSecurity, double pProfitPercent)
    {
	super (pAmount, pCostBuild, pCostRemove, pApproval, pProduction,
	       pEmissions, pSecurity, pProfitPercent);
    }
}
