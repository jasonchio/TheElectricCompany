public class Plant
{
   protected int    mAmount;
   protected double mCost;
   protected double mApproval;
   protected double mProduction;
   protected double mEmissions;
   protected double mSecurity;
   protected double mProfitPercent;

   /**
    * Default Constructor
    *  
    */
   public Plant()
   {
      mAmount = 100;
      mCost = 1;
      mApproval = 50;
      mProduction = .65;
      mEmissions = 2;
      mSecurity = .09;
      mProfitPercent = 45;
   }
   
   /**
    * Default Constructor
    *
    * @params pAmount, pCost, pApproval, pProduction, 
    *         pEmissions, pSecurity, pProfitPercent all doubles
    *
    */
      public Plant(int pAmount, double pCost, double pApproval, 
                      double pProduction, double pEmissions, 
                      double pSecurity, double pProfitPercent)
   {
      mAmount = pAmount;
      mCost = pCost;
      mApproval = pApproval;
      mProduction = pProduction;
      mEmissions = pEmissions;
      mSecurity = pSecurity;
      mProfitPercent = pProfitPercent;
   }
   
   /**
    * @param pAmount to add
    */
   public void add(int pAmount)
   {
      mAmount += pAmount;
   }

   /**
    * @param pAmount to remove  
    */
   public void remove(int pAmount)
   {
      if (mAmount - pAmount >= 0)
      {
         mAmount -= pAmount;
      }
   }

   ////////////////////////// Getters

   /**
    * Generic Getter
    */
   public double getAmount()
   {
      return mAmount;
   }
   
   /**
    * Generic Getter
    */
   public double getCost()
   {
      return mCost;
   }
   
   /**
    * Generic Getter
    */
   public double getApproval()
   {
      return mApproval;
   }
   
   /**
    * Generic Getter
    */
   public double getProduction()
   {
      return mProduction;
   }
   
   /**
    * Generic Getter
    */
   public double getEmissions()
   {
      return mEmissions;
   }
   
   /**
    * Generic Getter
    */
   public double getSecurity()
   {
      return mSecurity;
   }
   
   /**
    * Generic Getter
    */
   public double getProfitPercent()
   {
      return mProfitPercent;
   }
   
   /////////////////////// Setters
   
   /**
    * Generic Setter
    */
   public void setAmount(int pAmount)
   {
      mAmount = pAmount;
   }
   
   /**
    * Generic Setter
    */
   public void setCost(double pCost)
   {
     mCost = pCost;
   }
   
   /**
    * Generic Setter
    */
   public void setApproval(double pApproval)
   {
     mApproval = pApproval;
   }
   
   /**
    * Generic Setter
    */
   public void setProduction(double pProduction)
   {
     mProduction = pProduction;
   }
   
   /**
    * Generic Setter
    */
   public void setEmissions(double pEmissions)
   {
     mEmissions = pEmissions;
   }
   
   /**
    * Generic Setter
    */
   public void setSecurity(double pSecurity)
   {
     mSecurity = pSecurity;
   }
   
   /**
    * Generic Setter
    */
   public void setProfitPercent(double pProfitPercent)
   {
     mProfitPercent = pProfitPercent;
   }
}
