package easigreen.service;

import easigreen.service.*;
import easigreen.system.*;

import java.util.ArrayList;

public class UpgradeMerger
{
    //////////////////// Variables

    /**
     * The budget change
     */
    private double mBudgetChange;

    /**
     * The total change in approval
     */
    private double mApprovalChange;

    /**
     * The total change in emissions
     */
    private double mEmissionsChange;

    /**
     * The total change in price
     */
    private double mPriceChange;

    /**
     * The dotal change in demand
     */
    private double mDemandChange;

    /**
     * The total change in demand rate
     */
    private double mDemandRateChange;

    /**
     * The change in the power production of a single nuclear plant
     */
    private double mNpow;

    /**
     * The change in the cost of a single nuclear plant
     */
    private double mNcost;

    /**
     * The change in the approval rating of each nuclear plant
     */
    private double mNatt;

    /**
     * The change in the emissions of a single nuclear plant
     */
    private double mNemit;

    /**
     * The change in the security of a single nuclear plant
     */
    private double mNsec;

    /**
     * The change in the profit of a single nuclear plant
     */
    private double mNprof;

    /**
     * The change in the power production of a single fossil plant
     */
    private double mFpow;

    /**
     * The change in the cost of a single fossil plant
     */
    private double mFcost;

    /**
     * The change in the approval rating of each fossil plant
     */
    private double mFatt;

    /**
     * The change in the emissions of a single fossil plant
     */
    private double mFemit;

    /**
     * The change in the security of a single fossil plant
     */
    private double mFsec;

    /**
     * The change in the profit of a single fossil plant
     */
    private double mFprof;

    /**
     * The change in the power production of a single renewable plant
     */
    private double mRpow;

    /**
     * The change in the cost of a single renewable plant
     */
    private double mRcost;

    /**
     * The change in the approval rating of each renewable plant
     */
    private double mRatt;

    /**
     * The change in the emissions of a single renewable plant
     */
    private double mRemit;

    /**
     * The change in the security of a single renewable plant
     */
    private double mRsec;

    /**
     * The change in the profit of a single renewable plant
     */
    private double mRprof;

    /**
     * The change in the daily oil consumption
     */
    private double mOil;

    /**
     * The change in the oil security
     */
    private double mOilSec;

    /**
     * The change in the oil growth
     */
    private double mOilGrow;

    //////////////////// Methods

    public double getBudgetChange()
    {
        return mBudgetChange;
    }
    public double getApprovalChange()
    {
        return mApprovalChange;
    }
    public double getEmissionsChange()
    {
        return mEmissionsChange;
    }
    public double getPriceChange()
    {
        return mPriceChange;
    }
    public double getDemandChange()
    {
        return mDemandChange;
    }
    public double getDemandRateChange()
    {
        return mDemandRateChange;
    }

    /**
     * Get the change in national power
     * @return the change in national power
     */
    public double getNpow()
    {
        return mNpow;
    }

    /**
     * Get the change in nuclear cost
     * @return change in nuclear cost
     */
    public double getNcost()
    {
        return mNcost;
    }

    /**
     * Get the change in nuclear approval rating
     * @return the change in nuclear approval rating
     */
    public double getNatt()
    {
        return mNatt;
    }

    /**
     * Get the change in Nuclear Emissions
     * @return the change in nuclear emissions
     */
    public double getNemit()
    {
        return mNemit;
    }

    /**
     * Get the change in Nuclear Security
     * @return the change in nuclear security
     */
    public double getNsec()
    {
        return mNsec;
    }

    /**
     * Get the change in nuclear profit
     * @return the change in nuclear profit
     */
    public double getNprof()
    {
        return mNprof;
    }

    /**
     * Get the change in fossil power
     * @return the change in fossil power
     */
    public double getFpow()
    {
        return mFpow;
    }

    /**
     * Get the change in fossil cost
     * @return the change in fossil cost
     */
    public double getFcost()
    {
        return mFcost;
    }

    /**
     * Get the change in fossil approval rating
     * @return the change in fossil approval rating
     */
    public double getFatt()
    {
        return mFatt;
    }

    /**
     * Get the change in fossil emissions
     * @return the change in fossil emissions
     */
    public double getFemit()
    {
        return mFemit;
    }

    /**
     * Get the change in fossil security
     * @return the change in fossil security
     */
    public double getFsec()
    {
        return mFsec;
    }

    /**
     * Get the change in fossil profit
     * @return the change in fossil profit
     */
    public double getFprof()
    {
        return mFprof;
    }

    /**
     * Get the change in renewable power
     * @return the change in renewable power
     */
    public double getRpow()
    {
        return mRpow;
    }

    /**
     * Get the change in renewable cost
     * @return the change in renewable cost
     */
    public double getRcost()
    {
        return mRcost;
    }

    /**
     * Get the change in approval rating of renewable
     * @return the change in approval rating of renewable
     */
    public double getRatt()
    {
        return mRatt;
    }

    /**
     * Get the change in renewable emissions
     * @return the change in Renewable emissions
     */
    public double getRemit()
    {
        return mRemit;
    }

    /**
     * Get the change in renewable security
     * @return the change in renewable security
     */
    public double getRsec()
    {
        return mRsec;
    }

    /**
     * Get the change in renewable profit
     * @return the change in renewable profit
     */
    public double getRprof()
    {
        return mRprof;
    }

    /**
     * Get the change in daily oil consumption
     * @return the change in daily oil consumption
     */
    public double getOil()
    {
        return mOil;
    }

    /**
     * Get the change in oil security
     * @return the change in oil security
     */
    public double getOilSec()
    {
        return mOilSec;
    }

    /**
     * Get the change in oil growth
     * @return the change in oil growth
     */
    public double getOilGrow()
    {
        return mOilGrow;
    }


    public void setBudgetChange(double pBudgetChange)
    {
        mBudgetChange = pBudgetChange;
    }
    public void setApprovalChange(double pBudgetApproval)
    {
        mApprovalChange = pBudgetApproval;
    }
    public void setPriceChange(double pPriceChange)
    {
        mPriceChange = pPriceChange;
    }
    public void setDemandChange(double pDemandChange)
    {
        mDemandChange = pDemandChange;
    }

    public void setDemandRateChange(double pDemandRateChange)
    {
        mDemandRateChange = pDemandRateChange;
    }

    public void setEmissionsChange(double pEmissionsChange)
    {
        mEmissionsChange = pEmissionsChange;
    }

    /**
     * Set the change in nuclear power
     * @param pNpow a double
     */
    public void setNpow(double pNpow)
    {
        mNpow = pNpow;
    }

    /**
     * Set the change in nuclear cost
     * @param pNcost a double
     */
    public void setNcost(double pNcost)
    {
        mNcost = pNcost;
    }

    /**
     * Set the change in nuclear approval rating
     * @param pNatt a double
     */
    public void setNatt(double pNatt)
    {
        mNatt = pNatt;
    }

    /**
     * Set the change in nuclear emissions
     * @param pNemit a double
     */
    public void setNemit(double pNemit)
    {
        mNemit = pNemit;
    }

    /**
     * Set the change in nuclear security
     * @param pNsec a double
     */
    public void setNsec(double pNsec)
    {
        mNsec = pNsec;
    }

    /**
     * Set the change in nuclear profit
     * @param pNprof
     */
    public void setNprof(double pNprof)
    {
        mNprof = pNprof;
    }

    /**
     * Set the change in fossil power
     * @param pFpow a double
     */
    public void setFpow(double pFpow)
    {
        mFpow = pFpow;
    }

    /**
     * Set the change in fossil cost
     * @param pFcost a double
     */
    public void setFcost(double pFcost)
    {
        mFcost = pFcost;
    }

    /**
     * Set the change in fossil approval rating
     * @param pFatt a double
     */
    public void setFatt(double pFatt)
    {
        mFatt = pFatt;
    }

    /**
     * Set the change in fossil emissions
     * @param pFemit a double
     */
    public void setFemit(double pFemit)
    {
        mFemit = pFemit;
    }

    /**
     * Set the change in fossil security
     * @param pFsec a double
     */
    public void setFsec(double pFsec)
    {
        mFsec = pFsec;
    }

    /**
     * Set the change in fossil profit
     * @param pFprof a double
     */
    public void setFprof(double pFprof)
    {
        mFprof = pFprof;
    }

    /**
     * Set the change in renewable power
     * @param pRpow a double
     */
    public void setRpow(double pRpow)
    {
        mRpow = pRpow;
    }

    /**
     * Set the change in renewable cost
     * @param pRcost a double
     */
    public void setRcost(double pRcost)
    {
        mRcost = pRcost;
    }

    /**
     * Set the change in renewable approval rating
     * @param pRatt a double
     */
    public void setRatt(double pRatt)
    {
        mRatt = pRatt;
    }

    /**
     * Set the change in renewable emissions
     * @param pRemit a double
     */
    public void setRemit(double pRemit)
    {
        mRemit = pRemit;
    }

    /**
     * Set the change in renewable security
     * @param pRsec a double
     */
    public void setRsec(double pRsec)
    {
        mRsec = pRsec;
    }

    /**
     * Set the change in renewable profit
     * @param pRprof a double
     */
    public void setRprof(double pRprof)
    {
        mRprof = pRprof;
    }

    /**
     * Set the change in daily oil consumption
     * @param pOil
     */
    public void setOil(double pOil)
    {
        mOil = pOil;
    }

    /**
     * Set the change in oil security
     * @param pOilSec a double
     */
    public void setOilSec(double pOilSec)
    {
        mOil = pOilSec;
    }

    /**
     * Set the change in oil growth
     * @param pOilGrow a double
     */
    public void setOilGrow(double pOilGrow)
    {
        mOil = pOilGrow;
    }
}
