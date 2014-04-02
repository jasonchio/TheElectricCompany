package easigreen.service;

import easigreen.system.*;
import easigreen.service.*;

/**
 * The technology class contains the information about what will be changed
 * when it is implemented.
 *
 * @version 0.1.3
 * @author Larson Caldwell
 * @author Sam Graham
 * @author Haru McClellan
 */
public class Technology
{
    //////////////////// Variables

    /**
     * 1 to 10 scale of the technology quality
     */
    private int mQuality;

    /**
     * The budget change
     */
    private double mBudgetChange;

    /**
     * The energy demand change
     */
    private double mNRGChange;

    /**
     * The change in net emissions
     */
    private double mEmissionsChange;

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

    /**
     * Indicates whether or not this technology has already been implemented
     */
    private boolean hasBeenUsed;
	
	/**
     * Name of the Technology
     */
    private String mName;

	
	/**
     * Name of the Technology Code one
     */
    private String mTec1;
	/**
     * Name of the Technology Code two
     */
    private String mTec2;
	/**
     * Name of the Technology Code three
     */
    private String mTec3;
	/**
     * Name of the Technology Code four
     */
    private String mTec4;
	/**
     * Name of the Technology Code five
     */
    private String mTec5;
	/**
     * Name of the Technology Code six
     */
    private String mTec6;
	/**
     * Name of the Technology Code seven
     */
    private String mTec7;
	/**
     * Name of the Technology Code eight
     */
    private String mTec8;
	/**
     * Name of the Technology Code nine
     */
    private String mTec9;
	/**
     * Name of the Technology Code ten
     */
    private String mTec10;
	
    //////////////////// Constructors

    /**
     * Default Constructor
     */
    public Technology()
    {
    }

    /**
     * Pass in constructor
     *
     * @param pBudgetChange the change in the budget
     * @param pNRGChange the change in energy demand
     * @param pEmissionsChange the change in Emissions
     * @param pNpow the change in the power production of nuclear plants
     * @param pNcost the change in the cost of a nuclear plant
     * @param pNatt the change in the approval rating of a nuclear plant
     * @param pNemit the change in emissions of a nuclear plant
     * @param pNsec the change in security of a nuclear plant
     * @param pNprof the change in profit of a nuclear plant
     * @param pFpow the change in power production of fossil plant
     * @param pFcost the change in cost of fossil production
     * @param pFatt the change in the approval rating of fossil plants
     * @param pFemit the change in the emissions of fossil plants
     * @param pFsec the change in the security of fossil plants
     * @param pFprof the change in the profit of fossil plants
     * @param pRpow the change in the power production of renewable plants
     * @param pRcost the change in the cost of a renewable plant
     * @param pRatt the change in the approval rating of a renewable plant
     * @param pRemit the change in emissions of a renewable plant
     * @param pRsec the change in security of a renewable plant
     * @param pRprof the change in profit of a renewable plant
     * @param pOil the change in daily oil consumption
     * @param pOilSec the change in oil security
     * @param pOilGrow the change in oil growth
     * @param pQuality the quality of the technology
     */
    public Technology(double pBudgetChange, double pNRGChange,
                      double pEmissionsChange, double pNpow, double pNcost,
                      double pNatt, double pNemit, double pNsec,
                      double pNprof, double pFpow, double pFcost,
                      double pFatt, double pFemit, double pFsec,
                      double pFprof, double pRpow, double pRcost,
                      double pRatt, double pRemit, double pRsec,
                      double pRprof, double pOil, double pOilSec,
                      double pOilGrow, int pQuality)
    {
        mBudgetChange = pBudgetChange;
        mNRGChange = pNRGChange;
        mEmissionsChange = pEmissionsChange;
        mNpow = pNpow;
        mNcost = pNcost;
        mNatt = pNatt;
        mNemit = pNemit;
        mNsec = pNsec;
        mNprof = pNprof;
        mFpow =pFpow;
        mFcost = pFcost;
        mFatt =pFatt;
        mFemit = pFemit;
        mFsec =pFsec;
        mFprof = pFprof;
        mRpow =pRpow;
        mRcost = pRcost;
        mRatt =pRatt;
        mRemit = pRemit;
        mRsec =pRsec;
        mRprof = pRprof;
        mOil = pOil;
        mOilSec = pOilSec;
        mOilGrow = pOilGrow;
        mQuality = pQuality;
    }
	
	
	/**
     * Pass in constructor
     *
     * @param pBudgetChange the change in the budget
     * @param pNRGChange the change in energy demand
     * @param pEmissionsChange the change in Emissions
     * @param pNpow the change in the power production of nuclear plants
     * @param pNcost the change in the cost of a nuclear plant
     * @param pNatt the change in the approval rating of a nuclear plant
     * @param pNemit the change in emissions of a nuclear plant
     * @param pNsec the change in security of a nuclear plant
     * @param pNprof the change in profit of a nuclear plant
     * @param pFpow the change in power production of fossil plant
     * @param pFcost the change in cost of fossil production
     * @param pFatt the change in the approval rating of fossil plants
     * @param pFemit the change in the emissions of fossil plants
     * @param pFsec the change in the security of fossil plants
     * @param pFprof the change in the profit of fossil plants
     * @param pRpow the change in the power production of renewable plants
     * @param pRcost the change in the cost of a renewable plant
     * @param pRatt the change in the approval rating of a renewable plant
     * @param pRemit the change in emissions of a renewable plant
     * @param pRsec the change in security of a renewable plant
     * @param pRprof the change in profit of a renewable plant
     * @param pOil the change in daily oil consumption
     * @param pOilSec the change in oil security
     * @param pOilGrow the change in oil growth
     * @param pQuality the quality of the technology
     */
    public Technology(double pBudgetChange, double pNRGChange,
                      double pEmissionsChange, double pNpow, double pNcost,
                      double pNatt, double pNemit, double pNsec,
                      double pNprof, double pFpow, double pFcost,
                      double pFatt, double pFemit, double pFsec,
                      double pFprof, double pRpow, double pRcost,
                      double pRatt, double pRemit, double pRsec,
                      double pRprof, double pOil, double pOilSec,
                      double pOilGrow, int pQuality,
					  String pName, String pTec1, String pTec2, 
					  String pTec3, String pTec4, String pTec5,
					  String pTec6, String pTec7, String pTec8,
					  String pTec9, String pTec10)
    {
        mBudgetChange = pBudgetChange;
        mNRGChange = pNRGChange;
        mEmissionsChange = pEmissionsChange;
        mNpow = pNpow;
        mNcost = pNcost;
        mNatt = pNatt;
        mNemit = pNemit;
        mNsec = pNsec;
        mNprof = pNprof;
        mFpow =pFpow;
        mFcost = pFcost;
        mFatt =pFatt;
        mFemit = pFemit;
        mFsec =pFsec;
        mFprof = pFprof;
        mRpow =pRpow;
        mRcost = pRcost;
        mRatt =pRatt;
        mRemit = pRemit;
        mRsec =pRsec;
        mRprof = pRprof;
        mOil = pOil;
        mOilSec = pOilSec;
        mOilGrow = pOilGrow;
        mQuality = pQuality;
		mName = pName;
		mTec1 = pTec1;
		mTec2 = pTec2;
		mTec3 = pTec3;
		mTec4 = pTec4;
		mTec5 = pTec5;
		mTec6 = pTec6;
		mTec7 = pTec7;
		mTec8 = pTec8;
		mTec9 = pTec9;
		mTec10 = pTec10;
		
		
    }

    ////////////////////////////// Methods
    
    /**
     * Override object's toString Method
     * @return a string representing the object
     */
    public String toString()
    {
       return mName + " " + mBudgetChange + " " + mNRGChange 
                    + " "  + mEmissionsChange + " " 
                    + mNpow + " "+ mNcost + " " + mNatt + " " 
                    + mNemit + " "+ mNsec + " "
                    + mNprof + " " + mFpow 
                    + " "+ mFcost + " " +mFatt+" " 
                    + mFemit + " "
                    + mFsec + " "+ mFprof + " "
                    + mRpow + " "+ mRcost + " "
                    + mRatt+" " + mRemit + " "
                    + mRsec + " "+ mRprof + " "
                    + mOil + " " + mOilSec + " " 
                    + mOilGrow + " " + mQuality + " " 
                    + " " + mTec1 
                    + " " + mTec2+ " " + mTec3+ " " 
                    + mTec4 + " " + mTec5 + " " 
                    + mTec6 + " " + mTec7 + " " 
                    + mTec8 + " " + mTec9  + " " 
                    + mTec10 + " " + mTec1;
    }

    ////////////////////////////// Getters

    /**
     * The name of the technology
     * @return the String of the name
     */
    public String getName()
    {
       return mName;
    }
    
    /**
     * @return the quality of the technology
     */
    public int getQuality()
    {
        return mQuality;
    }

    public int iWantQuality()
    {
        return 5;
    }

    /**
     * Get the change in budget
     * @return the change in budget
     */
    public double getBudgetChange()
    {
        return mBudgetChange;
    }

    /**
     * Get the change in national energy demand
     * @return the change in national energy demand
     */
    public double getNRGChange()
    {
        return mNRGChange;
    }

    /**
     * Get the change in emissions
     * @return the change in emissions
     */
    public double getEmissionsChange()
    {
        return mEmissionsChange;
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

    /**
     * Get the whether or not the technology has been implemented
     * @return whether or not the technology has been implemented
     */
    public boolean getHasBeenUsed()
    {
        return hasBeenUsed;
    }

    //////////////////////// Setters

    /**
     * Set the quality of the technology to a new value
     *
     * @return pQuality the new quality
     */
    public void setQuality(int pQuality)
    {
        mQuality = pQuality;
    }

    /**
     * Set the change in budget
     * @param pBudgetChange change in budget
     */
    public void setBudgetChange(double pBudgetChange)
    {
        mBudgetChange = pBudgetChange;
    }

    /**
     * Set the change in national energy demand
     * @param pNRGChange change in national energy demand
     */
    public void setNRGChange(double pNRGChange)
    {
        mNRGChange = pNRGChange;
    }

    /**
     * Set the change in emissions
     * @param pEmissionsChange a double
     */
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

    /**
     * Set if the technology has been used
     * @param isUsed a boolean
     */
    public void setHasBeenUsed(boolean isUsed)
    {
        hasBeenUsed = isUsed;
    }
    
     
}
