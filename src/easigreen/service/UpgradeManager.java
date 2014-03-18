import java.util.ArrayList;

/**
 * The Simulator class contains information that each different type of plant 
 * will use.  It will contain the number of a particular type of plant, the 
 * cost for each one, and the impacts that it will have on the short-term and 
 * long-term goals.
 *
 * @see java.util.ArrayList
 *
 * @version 0.1.2
 * @author Larson Caldwell
 * @author Sam Graham
 * @author Haru McClellan
 */
public class UpgradeManager
{
    //////////////////// Variables
   
    /**
     * The fossil plants
     */
    private Plant mFossil;

    /**
     * The nuclear plants
     */
    private Plant mNuclear;

    /**
     * The renewable plants
     */
    private Plant mRenewable;

    /**
     * The oil for the country
     */
    private Oil mOil;

    /**
     * The total amount of funds (in billions)
     */
    private double mBudget;

    /**
     * The total public approval
     */
    private double mApproval;

    /**
     * The new power production
     */
    private double mProduction;

    /**
     * The total emissions from all the plants
     */
    private double mEmissions;

    /**
     * The net profit
     */
    private double mProfit;

    /**
     * The net security
     */
    private double mSecurity;

    /**
     * The price for selling energy
     */
    private double mPrice;

    /**
     * The country's energy demand
     */
    private double mDemand;

    /**
     * The growth of the demand for the next round
     */
    private double mDemandGrowth;

    /**
     * The implemented technologys
     */
    private ArrayList<Technology> Techs;

    private int nuclearSci;
    private int fossilSci;
    private int renewableSci;
    private int oilSci;
    private int nuclearEng;
    private int fossilEng;
    private int renewableEng;
    private int oilDrilling;
    private int lobby;
    private int priceChange;
    //private TechnologyManager mTechnologyManager;
    //private RecourceManager mRecourceManager;

    //////////////////// Methods

    /**
     * This will place action points into the fossil science upgrade
     *
     * @param actions the number of action points to be spent here
     */
    public void fossilScience(int actions)
    {
	mFossil.setApproval(mFossil.getApproval() + actions * .5);
	mFossil.setSecurity(mFossil.getSecurity() + actions * .02);
        fossilSci += actions;
    }

    /**
     * This will place action points into the nuclear science upgrade
     *
     * @param actions the number of action points to be spent here
     */
    public void nuclearScience(int actions)
    {
        mNuclear.setApproval(mNuclear.getApproval() + actions * .3);
	mNuclear.setSecurity(mNuclear.getSecurity() + actions * .05);
        nuclearSci += actions;
    }

    /**
     * This will place action points into the renewable science upgrade
     *
     * @param actions the number of action points to be spent here
     */
    public void renewableScience(int actions)
    {
        mRenewable.setApproval(mRenewable.getApproval() + actions * .1);
	mRenewable.setSecurity(mRenewable.getSecurity() + actions * .01);
        renewableSci += actions;
    }

    /**
     * This will place action points into the oil science upgrade
     *
     * @param actions the number of action points to be spent here
     */
    public void oilScience(int actions)
    {
        mOil.setSecurity(mOil.getSecurity() + actions * .8);
        oilSci += actions;
    }

    /**
     * This will place action points into the fossil science engineering
     *
     * @param actions the number of action points to be spent here
     */
    public void fossilEngineering(int actions)
    {
        mFossil.setSecurity(mFossil.getSecurity() + actions * .08);
        fossilEng += actions;
    }

    /**
     * This will place action points into the nuclear science engineering
     * 
     * @param actions the number of action points to be spent here
     */
    public void nuclearEngineering(int actions)
    {
        mNuclear.setSecurity(mNuclear.getSecurity() + actions * .2);
        nuclearEng += actions;
    }

    /**
     * This will place action points into the renewable science engineering
     *
     * @param actions the number of action points to be spent here
     */
    public void renewableEngineering(int actions)
    {
        mRenewable.setSecurity(mRenewable.getSecurity() + actions * .03);
        renewableEng += actions;
    }

    /**
     * This will use action points to influence the price
     *
     * @param actions the number of action points to be spent here
     */
    public void priceChange(int actions)
    {
        mPrice    += (actions * .8);
        mApproval -= (actions * .5);
        priceChange += actions;
    }

    /**
     * This will use action points to lobby
     *
     * @param actions the number of action points to be spent here
     */
    public void lobby(int actions)
    {
        mBudget   += (actions * 1);
        mApproval -= (actions * .5);
        lobby += actions;
    }

    /**
     * This will use action points to influence oil drilling
     * 
     * @param actions the number of action points to be spent here
     */
    public void oilDrilling(int actions)
    {
        mOil.setSecurity(mOil.getSecurity() + (actions * 1.5));
        mOil.setConsumption(mOil.getConsumption() - (actions * .5));
        oilDrilling += actions;
    }

    //////////////////// Getters

    /**
     * Gets the oil
     *
     * @retrun mOil the oil
     */
    public Oil getOil()
    {
	return mOil;
    }

    /**
     * Gets the budget
     *
     * @return mBudget the budget
     */
    public double getBudget()
    {
	return mBudget;
    }

    /**
     * Get the approval rating
     *
     * @return mApproval the approval
     */
    public double getApproval()
    {
	return mApproval;
    }

    /**
     * Gets the total production
     *
     * @return mProduction the total production
     */
    public double getProduction()
    {
	return mProduction;
    }

    /**
     * Gets the total emissions
     *
     * @return mEmissions the total national emissions
     */
    public double getEmissions()
    {
	return mEmissions;
    }

    /**
     * Gets the net country's profit
     *
     * @return mProfit the country's net profit
     */
    public double getProfit()
    {
	return mProfit;
    }

    /**
     * Gets the overall security
     *
     * @return mSecurity the overall security
     */
    public double getSecurity()
    {
	return mSecurity;
    }

    /**
     * Gets the price of energy
     *
     * @return mPrice the energy price
     */
    public double getPrice()
    {
	return mPrice;
    }

    /**
     * Gets the energy demand
     *
     * @return mDemend the energy demand
     */
    public double getDemand()
    {
	return mDemand;
    }

    /**
     * Gets the growth of the energy demand
     *
     * @return mDemandGrowth the energy demand's growth
     */
    public double getDemandGrowth() { return mDemandGrowth; }

    //////////////////// Setters

    /**
     * Sets the fossil plant as a new plant
     *
     * @param newPlant the new plant
     */
    public void setFossil(Plant newPlant) 
    { 
	mFossil = newPlant; 
    }

    /**
     * Sets the nuclear plant as a new plant
     *
     * @param newPlant the new plant
     */
    public void setNuclear(Plant newPlant) 
    { 
	mNuclear = newPlant; 
    }

    /**
     * Sets the renewable plant as a new plant
     *
     * @param newPlant the new plant
     */
    public void setRenewable(Plant newPlant) 
    { 
	mRenewable = newPlant; 
    }

    /**
     * Sets the current oil as a new oil
     *
     * @param newOil the new oil
     */
    public void setOil(Oil newOil) 
    {
	mOil = newOil; 
    }

    /**
     * Sets the budget to a new value
     *
     * @param pBudget the new budget value
     */
    public void setBudget(double pBudget) 
    { 
	mBudget = pBudget; 
    }

    /**
     * Sets the approval to a new value
     *
     * @param pApproval the new approval rating
     */
    public void setApproval(double pApproval) 
    { 
	mApproval = pApproval; 
    }

    /**
     * Sets the production to a new value
     *
     * @param pProduction the new production value
     */
    public void setProduction(double pProduction) 
    { 
	mProduction = pProduction; 
    }

    /**
     * Sets the emissions to a new value
     *
     * @param pEmissions the new amount of emissions
     */
    public void setEmissions(double pEmissions) 
    { 
	mEmissions = pEmissions; 
    }

    /**
     * Sets the profit to a new value
     *
     * @param pProfit the new profit
     */
    public void setProfit(double pProfit) 
    { 
	mProfit = pProfit; 
    }

    /**
     * Sets the security to a new value
     *
     * @param pSecurity the new security value
     */
    public void setSecurity(double pSecurity) 
    { 
	mSecurity = pSecurity; 
    }

    /**
     * Sets the price to a new value
     *
     * @param pPrice the new price for production
     */
    public void setPrice(double pPrice) 
    { 
	mPrice = pPrice; 
    }

    /**
     * Sets the demand to a new value
     *
     * @param pDemand the new demand value
     */
    public void setDemand(double pDemand) 
    { 
	mDemand = pDemand; 
    }

    /**
     * Sets the growth of demand to a new value
     *
     * @param pGrowth the new growth of demand
     */
    public void setDemandGrowth(double pGrowth) 
    { 
	mDemandGrowth = pGrowth; 
    }
}