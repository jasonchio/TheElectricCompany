/**
 * 
 * @version 0.1.1
 * @author Larson Caldwell
 * @author Sam Graham
 * @author Haru McClellan
 */
public class RenewablePlant
   extends Plant
{
   public RenewablePlant()
   {
      mAmount = 140;
      mCost = .2;
      mApproval = 35;
      mProduction = .1;
      mEmissions = .05;
      mSecurity = .03;
      mProfitPercent = 20;
   }

   public RenewablePlant(int pAmount, double pCost, double pApproval, 
                      double pProduction, double pEmissions, 
                      double pSecurity, double pProfitPercent)
   {
      super (pAmount, pCost, pApproval, pProduction, pEmissions, pSecurity,
             pProfitPercent);
   }
}