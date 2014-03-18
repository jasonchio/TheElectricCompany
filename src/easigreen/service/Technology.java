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
     * The budget change
     */
    private int mBudgetChange;

    /**
     * The energy demand change
     */
    private int mNRGChange;

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
     */
    public Technology(int pBudgetChange, int pNRGChange,
                      double pEmissionsChange, double pNpow, double pNcost,
                      double pNatt, double pNemit, double pNsec,
                      double pNprof, double pFpow, double pFcost,
                      double pFatt, double pFemit, double pFsec,
                      double pFprof, double pRpow, double pRcost,
                      double pRatt, double pRemit, double pRsec,
                      double pRprof, double pOil, double pOilSec,
                      double pOilGrow)
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
    }

    ////////////////////////////// Getters

	/**
	 * Get the change in budget
	 */
    public int getBudgetChange()
    {
        return mBudgetChange;
    }
	
	/**
	 * Get the change in national energy demand
	 */
    public int getNRGChange()
    {
        return mNRGChange;
    }
	
	/**
	 * Get the change in emissions
	 */
    public double getEmissionsChange()
    {
        return mEmissionsChange;
    }
	
	/**
	 * Get the change in national power
	 */
    public double getNpow()
    {
        return mNpow;
    }
	
	/**
	 * Get the change in nuclear cost
	 */
    public double getNcost()
    {
        return mNcost;
    }
	
	/**
	 * Get the change in nuclear approval rating
	 */
    public double getNatt()
    {
        return mNatt;
    }
	
	/**
	 * Get the change in Nuclear Emissions
	 */
    public double getNemit()
    {
        return mNemit;
    }
	
	/**
	 * Get the change in Nuclear Security
	 */
    public double getNsec()
    {
        return mNsec;
    }
	
	/**
	 * Get the change in nuclear profit
	 */
    public double getNprof()
    {
        return mNprof;
    }

	/**
	 * Get the change in fossil power
	 */
    public double getFpow()
    {
        return mFpow;
    }
	
	/**
	 * Get the change in fossil cost
	 */
    public double getFcost()
    {
        return mFcost;
    }
	
	/**
	 * Get the change in fossil approval rating
	 */
    public double getFatt()
    {
        return mFatt;
    }
	
	/**
	 * Get the change in fossil emissions
	 */
    public double getFemit()
    {
        return mFemit;
    }
	
	/**
	 * Get the change in fossil security
	 */
    public double getFsec()
    {
        return mFsec;
    }
	
	/**
	 * Get the change in fossil profit
	 */
    public double getFprof()
    {
        return mFprof;
    }

	/**
	 * Get the change in renewable power
	 */
    public double getRpow()
    {
        return mRpow;
    }
	
	/**
	 * Get the change in renewable cost
	 */
    public double getRcost()
    {
        return mRcost;
    }
	
	/**
	 * Get the change in already rating of renewable
	 */
    public double getRatt()
    {
        return mRatt;
    }
	
	/**
	 * Get the change in renewable emissions
	 */
    public double getRemit()
    {
        return mRemit;
    }
	
	/**
	 * Get the change in renewable security
	 */
    public double getRsec()
    {
        return mRsec;
    }
	
	/**
	 * Get the change in renewable profit
	 */
    public double getRprof()
    {
        return mRprof;
    }

	/**
	 * Get the change in daily oil consumption
	 */
    public double getOil()
    {
        return mOil;
    }
	
	/**
	 * Get the change in oil security
	 */
    public double getOilSec()
    {
        return mOilSec;
    }
	
	/**
	 * Get the change in oil growth
	 */
    public double getOilGrow()
    {
        return mOilGrow;
    }

	/**
	 * Get the whether or not the technology has been implemented
	 */
    public boolean getHasBeenUsed()
    {
        return hasBeenUsed;
    }
	
    //////////////////////// Setters
	
	/**
	 * Set the change in budget
	 */
    public void setBudgetChange(int pBudgetChange)
    {
        mBudgetChange = pBudgetChange;
    }
	
	/**
	 * Set the change in national energy demand
	 */
    public void setNRGChange(int pNRGChange)
    {
        mNRGChange = pNRGChange;
    }
	
	/**
	 * Set the change in emissions
	 */
    public void setEmissionsChange(double pEmissionsChange)
    {
        mEmissionsChange = pEmissionsChange;
    }

	/**
	 * Set the change in nuclear power
	 */
    public void setNpow(double pNpow)
    {
        mNpow = pNpow;
    }
	
	/**
	 * Set the change in nuclear cost
	 */
    public void setNcost(double pNcost)
    {
        mNcost = pNcost;
    }
	
	/**
	 * Set the change in nuclear approval rating
	 */
    public void setNatt(double pNatt)
    {
        mNatt = pNatt;
    }
	
	/**
	 * Set the change in nuclear emissions
	 */
    public void setNemit(double pNemit)
    {
        mNemit = pNemit;
    }
	
	/**
	 * Set the change in nuclear security
	 */
    public void setNsec(double pNsec)
    {
        mNsec = pNsec;
    }
	
	/**
	 * Set the change in nuclear profit
	 */
    public void setNprof(double pNprof)
    {
        mNprof = pNprof;
    }

	/**
	 * Set the change in fossil power
	 */
    public void setFpow(double pFpow)
    {
        mFpow = pFpow;
    }
	
	/**
	 * Set the change in fossil cost
	 */
    public void setFcost(double pFcost)
    {
        mFcost = pFcost;
    }
	
	/**
	 * Set the change in fossil approval rating
	 */
    public void setFatt(double pFatt)
    {
        mFatt = pFatt;
    }
	
	/**
	 * Set the change in fossil emissions
	 */
    public void setFemit(double pFemit)
    {
        mFemit = pFemit;
    }
	
	/**
	 * Set the change in fossil security
	 */
    public void setFsec(double pFsec)
    {
        mFsec = pFsec;
    }
	
	/**
	 * Set the change in fossil profit
	 */
    public void setFprof(double pFprof)
    {
        mFprof = pFprof;
    }

	/**
	 * Set the change in renewable power
	 */
    public void setRpow(double pRpow)
    {
        mRpow = pRpow;
    }
	
	/**
	 * Set the change in renewable cost
	 */
    public void setRcost(double pRcost)
    {
        mRcost = pRcost;
    }
	
	/**
	 * Set the change in renewable approval rating
	 */
    public void setRatt(double pRatt)
    {
        mRatt = pRatt;
    }
	
	/**
	 * Set the change in renewable emissions
	 */
    public void setRemit(double pRemit)
    {
        mRemit = pRemit;
    }
	
	/**
	 * Set the change in renewable security
	 */
    public void setRsec(double pRsec)
    {
        mRsec = pRsec;
    }
	
	/**
	 * Set the change in renewable profit
	 */
    public void setRprof(double pRprof)
    {
        mRprof = pRprof;
    }

	/**
	 * Set the change in daily oil consumption
	 */
    public void setOil(double pOil)
    {
        mOil = pOil;
    }
	
	/**
	 * Set the change in oil security
	 */
    public void setOilSec(double pOilSec)
    {
        mOil = pOilSec;
    }
	
	/**
	 * Set the change in oil growth
	 */
    public void setOilGrow(double pOilGrow)
    {
        mOil = pOilGrow;
    }
	
	/**
	 * Set if the technology has been used
	 */
    public void setHasBeenUsed(boolean isUsed)
    {
        hasBeenUsed = isUsed;
    }
}