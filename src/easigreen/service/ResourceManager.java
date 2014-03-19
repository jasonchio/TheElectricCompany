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
public class ResourceManager
{
    //////////////////// Variables

    /**
     * The number of action points
     */
    private int mActionPoints;

    /**
     * The number of emission credits
     */
    private int mEmitCredits;

    /**
     * The number of market shares
     */
    private int mMarketShares;

    /**
     * The total amount of funds (in billions)
     */
    private double mBudget;

    /**
     * The total emissions from all the plants
     */
    private double mEmissions;

    /**
     * The growth of the demand for the next round
     */
    private double mDemandGrowth;

    //////////////////// Constructors

    /**
     * Emission credits are spent here
     *
     * @param credits the number of credits being spent
     */
    public void useEmissionCredits(int credits)
    {
        mEmissions -= (credits * 40);
        mEmitCredits -= credits;
    }

    /**
     * Market shares are spent here
     *
     * @param shares the amount of shares being used
     */
    public void useMarketShares(int shares)
    {
        mDemandGrowth += (shares * .1);
        mMarketShares -= shares;
    }

    /**
     * Action points can be traded for money here
     *
     * @param actions amount of action points to trade for cash
     */
    public void cashInActionPoints(int amount)
    {
	mActionPoints -= amount;
        mBudget += (amount * .5);
    }

    /**
     * Technologies can be traded for money with this method
     *
     * @param techs amount of technologies to trade for cash
     */
    public void cashInTechnologies(int techs)
    {
	mBudget += (techs * .5);
    }

    //////////////////// Getters

    /**
     * Gets the action points
     *
     * @return mActionPoints the action points
     */
    public int getActionPoints()
    {
	return mActionPoints;
    }

    /**
     * Gets the emission credits
     *
     * @return mEmitCredits the emission credits
     */
    public int getEmitCredits()
    {
	return mEmitCredits;
    }

    /**
     * Gets the market shares
     *
     * @return mMarketShares the market shares
     */
    public int getMarketShares()
    {
	return mMarketShares;
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
     * Gets the total emissions
     *
     * @return mEmissions the total national emissions
     */
    public double getEmissions()
    {
	return mEmissions;
    }

    /**
     * Gets the growth of the energy demand
     *
     * @return mDemandGrowth the energy demand's growth
     */
    public double getDemandGrowth() 
    { 
       return mDemandGrowth; 
    }

    //////////////////// Setters

    /**
     * Sets the action points to a new value
     *
     * @param amount the new amount of action points
     */
    public void setActionPoints(int amount) 
    { 
       mActionPoints = amount; 
    }

    /**
     * Sets the emission credits to a new amount
     *
     * @param amount the new amount of emission credits
     */
    public void setEmitCredits(int amount) 
    { 
       mEmitCredits = amount; 
    }

    /**
     * Sets the number of market shares to a new amount
     *
     * @param amount the new amount of market shares
     */
    public void setMarketShares(int amount) 
    { 
       mMarketShares = amount; 
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
     * Sets the emissions to a new value
     *
     * @param pEmissions the new amount of emissions
     */
    public void setEmissions(double pEmissions) 
    { 
	mEmissions = pEmissions; 
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