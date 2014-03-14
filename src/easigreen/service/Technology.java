/**
 * The technology class contains the information about what will be changed
 * when it is implemented.
 *
 * @version 0.1.1
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


    /// getters
    public int getBudgetChange() { return mBudgetChange; }
    public int getNRGChange() { return mNRGChange; }
    public double getEmissionsChange() { return mEmissionsChange; }
   
    public double getNpow() { return mNpow; }
    public double getNcost() { return mNcost; }
    public double getNatt() { return mNatt; }
    public double getNemit() { return mNemit; }
    public double getNsec() { return mNsec; }
    public double getNprof() { return mNprof; }

    public double getFpow() { return mFpow; }
    public double getFcost() { return mFcost; }
    public double getFatt() { return mFatt; }
    public double getFemit() { return mFemit; }
    public double getFsec() { return mFsec; }
    public double getFprof() { return mFprof; }

    public double getRpow() { return mRpow; }
    public double getRcost() { return mRcost; }
    public double getRatt() { return mRatt; }
    public double getRemit() { return mRemit; }
    public double getRsec() { return mRsec; }
    public double getRprof() { return mRprof; }

    public double getOil() { return mOil; }
    public double getOilSec() { return mOilSec; }
    public double getOilGrow() { return mOilGrow; }
    
    public boolean getHasBeenUsed() { return hasBeenUsed; }


    /// setters
    public void setBudgetChange(int pBudgetChange) { mBudgetChange = pBudgetChange; }
    public void setNRGChange(int pNRGChange) { mNRGChange = pNRGChange; }
    public void setEmissionsChange(double pEmissionsChange) { mEmissionsChange = pEmissionsChange; }

    public void setNpow(double pNpow) { mNpow = pNpow; }
    public void setNcost(double pNcost) { mNcost = pNcost; }
    public void setNatt(double pNatt) { mNatt = pNatt; }
    public void setNemit(double pNemit) { mNemit = pNemit; }
    public void setNsec(double pNsec) { mNsec = pNsec; }
    public void setNprof(double pNprof) { mNprof = pNprof; }

    public void setFpow(double pFpow) { mFpow = pFpow; }
    public void setFcost(double pFcost) { mFcost = pFcost; }
    public void setFatt(double pFatt) { mFatt = pFatt; }
    public void setFemit(double pFemit) { mFemit = pFemit; }
    public void setFsec(double pFsec) { mFsec = pFsec; }
    public void setFprof(double pFprof) { mFprof = pFprof; }
   
    public void setRpow(double pRpow) { mRpow = pRpow; }
    public void setRcost(double pRcost) { mRcost = pRcost; }
    public void setRatt(double pRatt) { mRatt = pRatt; }
    public void setRemit(double pRemit) { mRemit = pRemit; }
    public void setRsec(double pRsec) { mRsec = pRsec; }
    public void setRprof(double pRprof) { mRprof = pRprof; }

    public void setOil(double pOil) { mOil = pOil; }
    public void setOilSec(double pOilSec) { mOil = pOilSec; }
    public void setOilGrow(double pOilGrow) { mOil = pOilGrow; }
    public void setHasBeenUsed(boolean isUsed) { hasBeenUsed = isUsed; }
}