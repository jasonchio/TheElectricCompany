/**
 * 
 * @version 0.1.1
 * @author Larson Caldwell
 * @author Sam Graham
 * @author Haru McClellan
 */
public class FossilPlant
   extends Plant
{
   public FossilPlant()
   {
      mAmount = 100;
      mCost = 1;
      mApproval = 50;
      mProduction = .65;
      mEmissions = 2;
      mSecurity = .09;
      mProfitPercent = 45;
   }

   public FossilPlant(int pAmount, double pCost, double pApproval, 
                      double pProduction, double pEmissions, 
                      double pSecurity, double pProfitPercent)
   {
      super (pAmount, pCost, pApproval, pProduction, pEmissions, pSecurity,
             pProfitPercent);
   }
}