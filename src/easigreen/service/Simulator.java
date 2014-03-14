import java.util.ArrayList;

/**
 * The Plant class contains information that each different type of plant will
 * use.  It will contain the number of a particular type of plant, the cost for
 * each one, and the impacts that it will have on the short-term and long-term
 * goals.
 *
 * @see java.util.ArrayList
 *
 * @version 0.1.2
 * @author Larson Caldwell
 * @author Sam Graham
 * @author Haru McClellan
 */
public class Simulator
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
     * The implemented technologys
     */
    private ArrayList<Technology> Techs;

    //////////////////// Constructors

    /**
     * Oil and each type of plant is set up.  The system is updated to show the
     * starting values based on no action.
     */
    public Simulator()
    {  
	mNuclear = new NuclearPlant();
	mFossil = new FossilPlant();
	mRenewable = new RenewablePlant();
	mOil = new Oil();
	mBudget = 10;
	mPrice = 11;
      
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
     * The new Technology is implemented.  All the changes that the given
     * technology is designed to make take place within this method.
     *
     * @param newTechnology the new technology to be implemented
     */
    public void applyTechnology(Technology newTechnology)
    {
	mBudget += newTechnology.getBudgetChange();
	mDemand += newTechnology.getNRGChange();
	mEmissions += newTechnology.getEmissionsChange();

	mNuclear.setProduction(mNuclear.getProduction()
			       + newTechnology.getNpow());
	mNuclear.setCostBuild(mNuclear.getCostBuild()
			      + newTechnology.getNcost());
	mNuclear.setApproval(mNuclear.getApproval()
			     + newTechnology.getNatt());
	mNuclear.setEmissions(mNuclear.getEmissions()
			      + newTechnology.getNemit());
	mNuclear.setSecurity(mNuclear.getSecurity()
			     + newTechnology.getNsec());
	mNuclear.setProfitPercent(mNuclear.getProfitPercent()
				  + newTechnology.getNprof());

	mFossil.setProduction(mFossil.getProduction()
			      + newTechnology.getFpow());
	mFossil.setCostBuild(mFossil.getCostBuild()
			     + newTechnology.getFcost());
	mFossil.setApproval(mFossil.getApproval()
			    + newTechnology.getFatt());
	mFossil.setEmissions(mFossil.getEmissions()
			     + newTechnology.getFemit());
	mFossil.setSecurity(mFossil.getSecurity()
			    + newTechnology.getFsec());
	mFossil.setProfitPercent(mFossil.getProfitPercent()
				 + newTechnology.getFprof());

	mRenewable.setProduction(mRenewable.getProduction()
				 + newTechnology.getRpow());
	mRenewable.setCostBuild(mRenewable.getCostBuild()
				+ newTechnology.getRcost());
	mRenewable.setApproval(mRenewable.getApproval()
			       + newTechnology.getRatt());
	mRenewable.setEmissions(mRenewable.getEmissions()
				+ newTechnology.getRemit());
	mRenewable.setSecurity(mRenewable.getSecurity()
			       + newTechnology.getRsec());
	mRenewable.setProfitPercent(mRenewable.getProfitPercent()
				    + newTechnology.getRprof());

	mOil.setConsumption(mOil.getConsumption()
			    + newTechnology.getOil());
	mOil.setSecurity(mOil.getSecurity()
			 + newTechnology.getOilSec());
	mOil.setGrowth(mOil.getGrowth()
		       + newTechnology.getOilGrow());
    }

    /**
     * returns country's name
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
     * @retrun mRenewable the renewable plants
     */
    public Plant getRenewable() 
    { 
       return mRenewable; 
    }

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
     * 
     */
    public double getApproval() { return mApproval; }
    public double getProduction() { return mProduction; }
    public double getEmissions() { return mEmissions; }
    public double getProfit() { return mProfit; }
    public double getSecurity() { return mSecurity; }
    public double getPrice() { return mPrice; }
    
    public double getDemand() { return mDemand; }
    public double getDemandGrowth() { return mDemandGrowth; }
    
    ///  setters
    public void setName(String pName) { mName = pName; }
    public void setTeamMembers(ArrayList<String> pTeamMembers)
    { mTeamMembers = pTeamMembers; }
    public void setRound(int pRound) { mRound = pRound; }
    
    public void setFossil(Plant newPlant) { mFossil = newPlant; }
    public void setNuclear(Plant newPlant) { mNuclear = newPlant; }
    public void setRenewable(Plant newPlant) { mRenewable = newPlant; }
    public void setOil(Oil newOil) { mOil = newOil; }
    
    public void setActionPoints(int amount) { mActionPoints = amount; }
    public void setEmitCredits(int amount) { mEmitCredits = amount; }
    public void setMarketShares(int amount) { mMarketShares = amount; }
    
    public void setBudget(double pBudget) { mBudget = pBudget; }
    public void setApproval(double pApproval) { mApproval = pApproval; }
    public void setProduction(double pProduction) { mProduction = pProduction; }
    public void setEmissions(double pEmissions) { mEmissions = pEmissions; }
    public void setProfit(double pProfit) { mProfit = pProfit; }
    public void setSecurity(double pSecurity) { mSecurity = pSecurity; }
    public void setPrice(double pPrice) { mPrice = pPrice; }
    
    public void setDemand(double pDemand) { mDemand = pDemand; }
    public void setDemandGrowth(double pGrowth) { mDemandGrowth = pGrowth; }
    
    /**
     * This will add fossil plants and calculate changes in the variables
     *
     * @param amount the amount of fossil plants to add
     */
    public void addFossil(int amount)
    {
	mFossil.add(amount);

	mBudget     -= mFossil.getCostBuild();
        mEmissions  += mFossil.getEmissions() * amount;
        mApproval   += mFossil.getApproval() * amount;
        mSecurity   += mFossil.getSecurity() * amount;
        mProduction += mFossil.getProduction() * amount;
        mProfit     += mFossil.getProfitPercent() * amount;
    }
    
    /**
     * This will remove fossil plants and calculate changes in the variables
     *
     * @param amount the amount of fossil plants to remove
     */
    public void removeFossil(int amount)
    {
	mFossil.remove(amount);

	mBudget     -= mFossil.getCostRemove();
        mEmissions  -= mFossil.getEmissions() * amount;
        mApproval   -= mFossil.getApproval() * amount;
        mSecurity   -= mFossil.getSecurity() * amount;
        mProduction -= mFossil.getProduction() * amount;
        mProfit     -= mFossil.getProfitPercent() * amount;
    }

    /**
     * This will add nuclear plants and calculate changes in the variables
     *
     * @param amount the amount of nuclear plants to add
     */
    public void addNuclear(int amount)
    {
	mNuclear.add(amount);

	mBudget     -= mNuclear.getCostBuild();
        mEmissions  += mNuclear.getEmissions() * amount;
        mApproval   += mNuclear.getApproval() * amount;
        mSecurity   += mNuclear.getSecurity() * amount;
        mProduction += mNuclear.getProduction() * amount;
        mProfit     += mNuclear.getProfitPercent() * amount;
    }

    /**
     * This will remove nuclear plants and calculate changes in the variables
     *
     * @param amount the amount of nuclear plants to remove
     */
    public void removeNuclear(int amount)
    {
        mNuclear.remove(amount);

        mBudget     -= mNuclear.getCostRemove();
        mEmissions  -= mNuclear.getEmissions() * amount;
        mApproval   -= mNuclear.getApproval() * amount;
        mSecurity   -= mNuclear.getSecurity() * amount;
        mProduction -= mNuclear.getProduction() * amount;
        mProfit     -= mNuclear.getProfitPercent() * amount;
    }

    /**
     * This will add renewable plants and calculate changes in the variables
     *
     * @param amount the amount of renewable plants to add
     */
    public void addRenewable(int amount)
    {
        mRenewable.add(amount);

        mBudget     -= mRenewable.getCostBuild();
        mEmissions  += mRenewable.getEmissions() * amount;
        mApproval   += mRenewable.getApproval() * amount;
        mSecurity   += mRenewable.getSecurity() * amount;
        mProduction += mRenewable.getProduction() * amount;
        mProfit     += mRenewable.getProfitPercent() * amount;
    }

    /**
     * This will remove renewable plants and calculate changes in the variables
     *
     * @param amount amount the amount of renewable plants to remove
     */
    public void removeRenewable(int amount)
    {
	mRenewable.remove(amount);

	mBudget     -= mRenewable.getCostRemove();
        mEmissions  -= mRenewable.getEmissions() * amount;
        mApproval   -= mRenewable.getApproval() * amount;
        mSecurity   -= mRenewable.getSecurity() * amount;
        mProduction -= mRenewable.getProduction() * amount;
        mProfit     -= mRenewable.getProfitPercent() * amount;
    }
}