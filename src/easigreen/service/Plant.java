package easigreen.service;

import easigreen.system.*;

/**
 * The Plant class contains information that each different type of plant will
 * use.  It will contain the number of a particular type of plant, the cost for
 * each one, and the impacts that it will have on the short-term and long-term
 * goals.
 *
 * @version 0.1.1
 * @author Larson Caldwell
 * @author Sam Graham
 * @author Haru McClellan
 */
public class Plant
{
    //////////////////// Variables

    /**
     * The number of plants  FINNAL
     */
    protected int mAmount;

    /**
     * The cost to build each new plant
     */
    protected double mCostBuild;

    /**
     * The cost to remove each existing plant
     */
    protected double mCostRemove;

    /**
     * The approval rating per unit
     */
    protected double mApproval;

    /**
     * The power production per unit
     */
    protected double mProduction;

    /**
     * The emissions produced per unit
     */
    protected double mEmissions;

    /**
     * The security of each unit
     */
    protected double mSecurity;

    /**
     * The profit made with each unit
     */
    protected double mProfitPercent;

    //////////////////// Constructors

    /**
     * To assign values is pointless because we dont know what plant it is.
     */
    public Plant()
    {
        mAmount        = 0;
        mCostBuild     = 0;
        mCostRemove    = 0;
        mApproval      = 0;
        mProduction    = 0;
        mEmissions     = 0;
        mSecurity      = 0;
        mProfitPercent = 0;
    }

    /**
     * Sets passed values to a non-specific plant
     *
     * @param pAmount number of plants
     * @param pCostBuild cost to build each new plant
     * @param pCostRemove cost to remove each existing plant
     * @param pApproval approval rating per unit
     * @param pProduction power production per unit
     * @param pEmissions emissions produced per unit
     * @param pSecurity the security of each unit
     * @param pProfitPercent the profit made with each unit
     */
    public Plant(int pAmount, double pCostBuild, double pCostRemove,
                 double pApproval, double pProduction, double pEmissions,
                 double pSecurity, double pProfitPercent)
    {
        mAmount = pAmount;
        mCostBuild = pCostBuild;
        mCostRemove = pCostRemove;
        mApproval = pApproval;
        mProduction = pProduction;
        mEmissions = pEmissions;
        mSecurity = pSecurity;
        mProfitPercent = pProfitPercent;
    }

    //////////////////// Methods

    /**
     * New plants are added.
     *
     * @param pAmount the amount of new plants
     */
    public void add(int pAmount)
    {
        mAmount += pAmount;
    }

    /**
     * Existing plants are removed.
     *
     * @param pAmount the amount of plants to be removed
     */
    public boolean remove(int pAmount)
    {
        if (mAmount - pAmount >= 0) {
            mAmount -= pAmount;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Gets the amount of plants
     *
     * @return mAmount the amount of plants currently
     */
    public int getAmount()
    {
        return mAmount;
    }

    /**
     * Gets the cost to build each plant
     *
     * @return mCostBuild the cost of each plant to be built
     */
    public double getCostBuild()
    {
        return mCostBuild;
    }

    /**
     * Gets the cost to remove each plant
     *
     * @return mCostRemove the cost to remove each existing plant
     */
    public double getCostRemove()
    {
        return mCostRemove;
    }

    /**
     * Gets the approval rating of each plant
     *
     * @return mApproval the approval rating of each plant
     */
    public double getApproval()
    {
        return mApproval;
    }

    /**
     * Gets the power production of each plant
     *
     * @return mProduction the power production of each plant
     */
    public double getProduction()
    {
        return mProduction;
    }

    /**
     * Gets the emissions of each plant
     *
     * @return mEmissions the emissions of each plant
     */
    public double getEmissions()
    {
        return mEmissions;
    }

    /**
     * Gets the security rating of each plant
     *
     * @return mSecurity the security rating of each plant
     */
    public double getSecurity()
    {
        return mSecurity;
    }

    /**
     * Gets the profit of each plant
     *
     * @return mProfitPercent the profit of each plant
     */
    public double getProfitPercent()
    {
        return mProfitPercent;
    }

    /**
     * Sets the cost to build each plant
     *
     * @param pCostBuild the new cost to build each plant
     */
    public void setCostBuild(double pCostBuild)
    {
        mCostBuild = pCostBuild;
    }

    /**
     * Sets the cost to remove each plant
     *
     * @param pCostRemove the new cost to remove each plant
     */
    public void setCostRemove(double pCostRemove)
    {
        mCostRemove = pCostRemove;
    }

    /**
     * Sets the approval rating of each plant
     *
     * @param pApproval the new approval rating of each plant
     */
    public void setApproval(double pApproval)
    {
        mApproval = pApproval;
    }

    /**
     * Sets the power production of each plant
     *
     * @param pProduction the new power production of each plant
     */
    public void setProduction(double pProduction)
    {
        mProduction = pProduction;
    }

    /**
     * Sets the emissions of each plant
     *
     * @param pEmissions the new emissions of each plant
     */
    public void setEmissions(double pEmissions)
    {
        mEmissions = pEmissions;
    }

    /**
     * Sets the security rating of each plant
     *
     * @param pSecurity the new security rating of each plant
     */
    public void setSecurity(double pSecurity)
    {
        mSecurity = pSecurity;
    }

    /**
     * Sets the profit of each plant
     *
     * @param pProfit the new profit of each plant
     */
    public void setProfitPercent(double pProfitPercent)
    {
        mProfitPercent = pProfitPercent;
    }
}
