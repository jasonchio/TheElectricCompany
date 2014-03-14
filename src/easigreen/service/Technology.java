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
    private int BudgetChange;

    /**
     * The energy demand change
     */
    private int NRGChange;

    /**
     * The change in net emissions
     */
    private double EmissionsChange;

    /**
     * The change in the power production of a single nuclear plant
     */
    private double Npow;

    /**
     * The change in the cost of a single nuclear plant
     */
    private double Ncost;

    /**
     * The change in the approval rating of each nuclear plant
     */
    private double Natt;

    /**
     * The change in the emissions of a single nuclear plant
     */
    private double Nemit;

    /**
     * The change in the security of a single nuclear plant
     */
    private double Nsec;

    /**
     * The change in the profit of a single nuclear plant
     */
    private double Nprof;

    /**
     * The change in the power production of a single fossil plant
     */
    private double Fpow;
   
    /**
     * The change in the cost of a single fossil plant
     */
    private double Fcost;
   
    /**
     * The change in the approval rating of each fossil plant
     */
    private double Fatt;
   
    /**
     * The change in the emissions of a single fossil plant
     */
    private double Femit;
   
    /**
     * The change in the security of a single fossil plant
     */
    private double Fsec;
   
    /**
     * The change in the profit of a single fossil plant
     */
    private double Fprof;

    /**
     * The change in the power production of a single renewable plant
     */
    private double Rpow;
   
    /**
     * The change in the cost of a single renewable plant
     */
    private double Rcost;
   
    /**
     * The change in the approval rating of each renewable plant
     */
    private double Ratt;
   
    /**
     * The change in the emissions of a single renewable plant
     */
    private double Remit;
   
    /**
     * The change in the security of a single renewable plant
     */
    private double Rsec;
   
    /**
     * The change in the profit of a single renewable plant
     */
    private double Rprof;

    /**
     * The change in the daily oil consumption
     */
    private double Oil;

    /**
     * The change in the oil security
     */
    private double OilSec;

    /**
     * The change in the oil growth
     */
    private double OilGrow;


    /// getters
    public int getBudgetChange() { return BudgetChange; }
    public int getNRGChange() { return NRGChange; }
    public double getEmissionsChange() { return EmissionsChange; }
   
    public double getNpow() { return Npow; }
    public double getNcost() { return Ncost; }
    public double getNatt() { return Natt; }
    public double getNemit() { return Nemit; }
    public double getNsec() { return Nsec; }
    public double getNprof() { return Nprof; }

    public double getFpow() { return Fpow; }
    public double getFcost() { return Fcost; }
    public double getFatt() { return Fatt; }
    public double getFemit() { return Femit; }
    public double getFsec() { return Fsec; }
    public double getFprof() { return Fprof; }

    public double getRpow() { return Rpow; }
    public double getRcost() { return Rcost; }
    public double getRatt() { return Ratt; }
    public double getRemit() { return Remit; }
    public double getRsec() { return Rsec; }
    public double getRprof() { return Rprof; }

    public double getOil() { return Oil; }
    public double getOilSec() { return OilSec; }
    public double getOilGrow() { return OilGrow; }


    /// setters
    public void setBudgetChange(int pBudgetChange) { BudgetChange = pBudgetChange; }
    public void setNRGChange(int pNRGChange) { NRGChange = pNRGChange; }
    public void setEmissionsChange(double pEmissionsChange) { EmissionsChange = pEmissionsChange; }

    public void setNpow(double pNpow) { Npow = pNpow; }
    public void setNcost(double pNcost) { Ncost = pNcost; }
    public void setNatt(double pNatt) { Natt = pNatt; }
    public void setNemit(double pNemit) { Nemit = pNemit; }
    public void setNsec(double pNsec) { Nsec = pNsec; }
    public void setNprof(double pNprof) { Nprof = pNprof; }

    public void setFpow(double pFpow) { Fpow = pFpow; }
    public void setFcost(double pFcost) { Fcost = pFcost; }
    public void setFatt(double pFatt) { Fatt = pFatt; }
    public void setFemit(double pFemit) { Femit = pFemit; }
    public void setFsec(double pFsec) { Fsec = pFsec; }
    public void setFprof(double pFprof) { Fprof = pFprof; }
   
    public void setRpow(double pRpow) { Rpow = pRpow; }
    public void setRcost(double pRcost) { Rcost = pRcost; }
    public void setRatt(double pRatt) { Ratt = pRatt; }
    public void setRemit(double pRemit) { Remit = pRemit; }
    public void setRsec(double pRsec) { Rsec = pRsec; }
    public void setRprof(double pRprof) { Rprof = pRprof; }

    public void setOil(double pOil) { Oil = pOil; }
    public void setOilSec(double pOilSec) { Oil = pOilSec; }
    public void setOilGrow(double pOilGrow) { Oil = pOilGrow; }
}