public class Tester
{
   /**
    * Holds a game
    */
   private Simulator game;
   
   /**
    * Main Class for the tester
	* @param args the command line arguments
	*/
   public static void main(String[] args)
   {
      new Tester().run();
   }

   /**
    * Runs the  method
	*/
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

   /**
    * Prints out the Status to the command line
    */
   public void printStats()
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