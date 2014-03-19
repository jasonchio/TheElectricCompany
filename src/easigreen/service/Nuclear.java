package easigreen.service;

import easigreen.system.*;

/**
 * This class contains the default values for an unmodified nuclear plant.  It
 * will assign these values unless they are passed into the constructor.
 *
 * @version 0.1.1
 * @author Larson Caldwell
 * @author Sam Graham
 * @author Haru McClellan
 */
public class Nuclear
    extends Plant
{
    //////////////////// Constructors

    /**
     * Sets default values to a nuclear plant
     */
    public Nuclear()
    {
        mAmount = 18;
        mCostBuild = 2.5;
        mCostRemove = .5;
        mApproval = 35;
        mProduction = 1;
        mEmissions = 0;
        mSecurity = 0;
        mProfitPercent = 50;
    }

    /**
     * Sets passed values to a nuclear plant
     *
     * @param pAmount number of plants
     * @param pCost cost of each new plant
     * @param pApproval approval rating per unit
     * @param pProduction power production per unit
     * @param pEmissions emissions produced per unit
     * @param pSecurity the security of each unit
     * @param pProfitPercent the profit made with each unit
     */
    public Nuclear(int pAmount, double pCostBuild, double pCostRemove,
                        double pApproval, double pProduction, double pEmissions,
                        double pSecurity, double pProfitPercent)
    {
        super (pAmount, pCostBuild, pCostRemove, pApproval, pProduction,
               pEmissions, pSecurity, pProfitPercent);
    }
}
