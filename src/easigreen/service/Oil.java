public class Oil
{
   private double mConsumption;
   private double mSecurity;
   private double mGrowth;

   public Oil()
   {
      mConsumption = 1.7;
      mSecurity = -17;
      mGrowth = 20;
   }

   public double getConsumption()
   {
      return mConsumption;
   }

   public double getSecurity()
   {
      return mSecurity;
   }

   public double getGrowth()
   {
      return mGrowth;
   }

   public void setConsumption(double pConsumption)
   {
      mConsumption = pConsumption;
   }

   public void setSecurity(double pSecurity)
   {
      mSecurity = pSecurity;
   }

   public void setGrowth(double pGrowth)
   {
      mGrowth = pGrowth;
   }
}