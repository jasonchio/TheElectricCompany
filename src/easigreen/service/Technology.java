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

    ////////////////////////////// Getter

    /**
     * The name of the technology
     * @return the String of the name
     */
    public String getName()
    {
       return mName;
    }
    
    
     
}
