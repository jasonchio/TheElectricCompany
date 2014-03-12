public class Tester
{
   private Simulator game;
   
   public static void main(String[] args)
   {
      new Tester().run();
   }

   public void run()
   {
      game = new Simulator();

      getStats();

      game.addFossil(5);
      game.removeNuclear(4);
      game.addRenewable(7);

      game.update();

      getStats();
   }

   public void getStats()
   {
      System.out.println("");
      System.out.println("Budget:      " + game.getBudget());
      System.out.println("Approval:    " + game.getApproval());
      System.out.println("Production:  " + game.getProduction());
      System.out.println("Emissions:   " + game.getEmissions());
      System.out.println("Profit:      " + game.getProfit());
      System.out.println("Security:    " + game.getSecurity());
      System.out.println("");
   }
}