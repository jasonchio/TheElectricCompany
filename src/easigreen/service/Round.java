package easigreen.service;

import easigreen.system.*;

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
public class Round
{
    //////////////////// Variables

    /**
     * The name of the country
     */
    private String mName;

    /**
     * The names of the students
     */
    private ArrayList<String> mTeamMembers;

    /**
     * The round number
     */
    private int mRound;

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
     * The implemented technologies
     */
    private ArrayList<Technology> Techs;

    //////////////////// Constructors

    /**
     * Oil and each type of plant is set up.  The system is updated to show the
     * starting values based on no action.
     */
    public Round()
    {
        mNuclear      = new Nuclear();
        mFossil       = new Fossil();
        mRenewable    = new Renewable();
        mOil          = new Oil();
        mBudget       = 10;
        mPrice        = 11;
        mDemand       = 10;
        mDemandGrowth = 1;

        update();
    }

    //////////////////// Methods

    /**
     * This method updates the country's values according to the changes that
     * have taken place.  This method may be called in intervals of time or it
     * can be called at the press of a button.
     */
    public void update()
    {
        mApproval = mFossil.getApproval() + mNuclear.getApproval()
                    + mRenewable.getApproval();

        mProduction = (mFossil.getProduction() * mFossil.getAmount())
                      + (mNuclear.getProduction() * mNuclear.getAmount())
                      + (mRenewable.getProduction() * mRenewable.getAmount());

        mEmissions = (mFossil.getEmissions() * mFossil.getAmount())
                     + (mNuclear.getEmissions() * mNuclear.getAmount())
                     + (mRenewable.getEmissions() * mRenewable.getAmount());

        mProfit = (mFossil.getProfitPercent() * mFossil.getAmount())
                  + (mNuclear.getProfitPercent() * mNuclear.getAmount())
                  + (mRenewable.getProfitPercent() * mRenewable.getAmount());

        mSecurity = (mFossil.getSecurity() * mFossil.getAmount())
                    + (mNuclear.getSecurity() * mNuclear.getAmount())
                    + (mRenewable.getSecurity() * mRenewable.getAmount());
    }


	/**
	 * Adds a plant
	 *
	 * @param pAmount an integer
	 * @param pPlant a Plant
	 */
	private void addPlant(int pAmount, Plant pPlant)
	{
	   pPlant.add(pAmount);
	   
	   mBudget     -= pPlant.getCostBuild() * pAmount;
       mEmissions  += pPlant.getEmissions() * pAmount;
       mApproval   += pPlant.getApproval() * pAmount;
       mSecurity   += pPlant.getSecurity() * pAmount;
       mProduction += pPlant.getProduction() * pAmount;
       mProfit     += pPlant.getProfitPercent() * pAmount;
	}
	
	/**
	 * Removes a plant
	 *
	 * @param pAmount an integer
	 * @param pPlant a Plant
	 */
	private void removePlant(int pAmount, Plant pPlant)
	{
	   pPlant.remove(pAmount);
	   
	   mBudget     -= pPlant.getCostBuild() * pAmount;
       mEmissions  -= pPlant.getEmissions() * pAmount;
       mApproval   -= pPlant.getApproval() * pAmount;
       mSecurity   -= pPlant.getSecurity() * pAmount;
       mProduction -= pPlant.getProduction() * pAmount;
       mProfit     -= pPlant.getProfitPercent() * pAmount;
	}
	
	
    /**
     * This will add fossil plants and calculate changes in the variables
     *
     * @param amount the amount of fossil plants to add
     */
    public void addFossil(int amount)
    {
	   addPlant(amount, mFossil);
    }

    /**
     * This will remove fossil plants and calculate changes in the variables
     *
     * @param amount the amount of fossil plants to remove
     */
    public void removeFossil(int amount)
    {
	   removePlant(amount, mFossil);
    }

    /**
     * This will add nuclear plants and calculate changes in the variables
     *
     * @param amount the amount of nuclear plants to add
     */
    public void addNuclear(int amount)
    {
        addPlant(amount, mNuclear);
    }

    /**
     * This will remove nuclear plants and calculate changes in the variables
     *
     * @param amount the amount of nuclear plants to remove
     */
    public void removeNuclear(int amount)
    {
	   removePlant(amount, mNuclear);
    }

    /**
     * This will add renewable plants and calculate changes in the variables
     *
     * @param amount the amount of renewable plants to add
     */
    public void addRenewable(int amount)
    {
        addPlant(amount, mRenewable);
    }

    /**
     * This will remove renewable plants and calculate changes in the variables
     *
     * @param amount amount the amount of renewable plants to remove
     */
    public void removeRenewable(int amount)
    {
        removePlant(amount, mRenewable);
    }

    /**
     * This will place action points into the fossil science upgrade
     *
     * @param actions the number of action points to be spent here
     */
    public void fossilScience(int actions)
    {
	    // TODO Re-factor this
        // mFossil.setApproval(mFossil.getApproval() + actions * 0.5);
        // mFossil.setSecurity(mFossil.getSecurity() + actions * 0.02);
    }

    /**
     * This will place action points into the nuclear science upgrade
     *
     * @param actions the number of action points to be spent here
     */
    public void nuclearScience(int actions)
    {
        // mNuclear.setApproval(mNuclear.getApproval() + actions * 0.3);
        // mNuclear.setSecurity(mNuclear.getSecurity() + actions * 0.05);
    }

    /**
     * This will place action points into the renewable science upgrade
     *
     * @param actions the number of action points to be spent here
     */
    public void renewableScience(int actions)
    {
        // mRenewable.setApproval(mRenewable.getApproval() + actions * .1);
        // mRenewable.setSecurity(mRenewable.getSecurity() + actions * .01);
    }

    /**
     * This will place action points into the oil science upgrade
     *
     * @param actions the number of action points to be spent here
     */
    public void oilScience(int actions)
    {
        // mOil.setSecurity(mOil.getSecurity() + actions * .8);
    }

    /**
     * This will place action points into the fossil science engineering
     *
     * @param actions the number of action points to be spent here
     */
    public void fossilEngineering(int actions)
    {
        // mFossil.setSecurity(mFossil.getSecurity() + actions * .08);
    }

    /**
     * This will place action points into the nuclear science engineering
     *
     * @param actions the number of action points to be spent here
     */
    public void nuclearEngineering(int actions)
    {
        // mNuclear.setSecurity(mNuclear.getSecurity() + actions * .2);
    }

    /**
     * This will place action points into the renewable science engineering
     *
     * @param actions the number of action points to be spent here
     */
    public void renewableEngineering(int actions)
    {
        // mRenewable.setSecurity(mRenewable.getSecurity() + actions * .03);
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
    }

    /**
     * This will use action points to influence oil drilling
     *
     * @param actions the number of action points to be spent here
     */
    public void oilDrilling(int actions)
    {
        // mOil.setSecurity(mOil.getSecurity() + (actions * 1.5));
        // mOil.setConsumption(mOil.getConsumption() - (actions * .5));
    }

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
     * Returns the Country's name
     *
     * @return mName the country's name
     */
    public String getName()
    {
        return mName;
    }

    /**
     * Returns the names of the group members
     *
     * @return mTeamMembers the names of the group members
     */
    public ArrayList<String> getTeamMembers()
    {
        return mTeamMembers;
    }

    /**
     * Gets the round number
     *
     * @return mRound the round number
     */
    public int getRound()
    {
        return mRound;
    }

    /**
     * Gets the fossil plants
     *
     * @return mFossil the fossil plants
     */
    public Plant getFossil()
    {
        return mFossil;
    }

    /**
     * Gets the nuclear plants
     *
     * @return mNuclear the nuclear plants
     */
    public Plant getNuclear()
    {
        return mNuclear;
    }

    /**
     * Gets the renewable plants
     *
     * @return mRenewable the renewable plants
     */
    public Plant getRenewable()
    {
        return mRenewable;
    }

    /**
     * Gets the oil
     *
     * @return mOil the oil
     */
    public Oil getOil()
    {
        return mOil;
    }

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
     * @return mDemandGrowth the energy demands growth
     */
    public double getDemandGrowth()
    {
        return mDemandGrowth;
    }

    //////////////////// Setters

    /**
     * Sets the group name
     *
     * @param pName the new name of the country
     */
    public void setName(String pName)
    {
        mName = pName;
    }

    /**
     * Sets the team member names
     *
     * @param pTeamMembers the names of the team members
     */
    public void setTeamMembers(ArrayList<String> pTeamMembers)
    {
        mTeamMembers = pTeamMembers;
    }

    /**
     * Sets the round number
     *
     * @param pRound the round
     */
    public void setRound(int pRound)
    {
        mRound = pRound;
    }

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
