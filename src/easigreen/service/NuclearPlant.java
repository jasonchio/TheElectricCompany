/**
 * 
 * @version 0.1.1
 * @author Larson Caldwell
 * @author Sam Graham
 * @author Haru McClellan
 */
public class NuclearPlant
   extends Plant
{
   public NuclearPlant()
   {
      mAmount = 18;
      mCost = 2.5;
      mApproval = 35;
      mProduction = 1;
      mEmissions = 0;
      mSecurity = 0;
      mProfitPercent = 50;
   }

   public NuclearPlant(int pAmount, double pCost, double pApproval, 
                      double pProduction, double pEmissions, 
                      double pSecurity, double pProfitPercent)
   {
      super (pAmount, pCost, pApproval, pProduction, pEmissions, pSecurity,
             pProfitPercent);
   }
}