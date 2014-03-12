import java.util.*;

public class Simulator
{
   private String mName;
   private ArrayList<String> mTeamMembers;
   private int mRound;
   
   private Plant mFossil;
   private Plant mNuclear;
   private Plant mRenewable;
   private Oil mOil;
   
   private int mActionPoints;
   private int mEmitCredits;
   private int mMarketShares;

   private double mBudget;
   private double mApproval;
   private double mProduction;
   private double mEmissions;
   private double mProfit;
   private double mSecurity;

   private double mDemand;
   private double mDemandGrowth;

   private ArrayList<Technology> Techs;

   public Simulator()
   {  
      mNuclear = new NuclearPlant();
      mFossil = new FossilPlant();
      mRenewable = new RenewablePlant();
      mOil = new Oil();
      mBudget = 10;
      
      update();
   }

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

   public void applyTechnology(Technology newTechnology)
   {
      mBudget += newTechnology.getBudgetChange();
      mDemand += newTechnology.getNRGChange();
      mEmissions += newTechnology.getEmissionsChange();

      mNuclear.setProduction(mNuclear.getProduction()
                             + newTechnology.getNpow());
      mNuclear.setCost(mNuclear.getCost()
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
      mFossil.setCost(mFossil.getCost()
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
      mRenewable.setCost(mRenewable.getCost()
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

   ///  getters
   public String getName() { return mName; }
   public ArrayList<String> getTeamMembers() { return mTeamMembers; }
   public int getRound() { return mRound; }
   
   public Plant getFossil() { return mFossil; }
   public Plant getNuclear() { return mNuclear; }
   public Plant getRenewable() { return mRenewable; }
   public Oil getOil() { return mOil; }
   
   public int getActionPoints() { return mActionPoints; }
   public int getEmitCredits() { return mEmitCredits; }
   public int getMarketShares() { return mMarketShares; }

   public double getBudget() { return mBudget; }
   public double getApproval() { return mApproval; }
   public double getProduction() { return mProduction; }
   public double getEmissions() { return mEmissions; }
   public double getProfit() { return mProfit; }
   public double getSecurity() { return mSecurity; }

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

   public void setDemand(double pDemand) { mDemand = pDemand; }
   public void setDemandGrowth(double pGrowth) { mDemandGrowth = pGrowth; }


   public void addFossil(int amount)
   {
      mFossil.add(amount);
      mBudget -= .5;
   }

   public void removeFossil(int amount)
   {
      mFossil.remove(amount);
      mBudget -= .1;
   }

   public void addNuclear(int amount)
   {
      mNuclear.add(amount);
      mBudget -= 2;
   }

   public void removeNuclear(int amount)
   {
      mNuclear.remove(amount);
      mBudget -= 1;
   }

   public void addRenewable(int amount)
   {
      mRenewable.add(amount);
      mBudget -= .1;
   }

   public void removeRenewable(int amount)
   {
      mRenewable.remove(amount);
      mBudget += .1;
   }
}