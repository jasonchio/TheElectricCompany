import java.util.ArrayList;

/**
 * The sim city is the main class of the application.  It uses the user
 * interface to communicate with the user, uses the simulator to process the
 * data, and uses the CSV getter to create and access files containing saved
 * changes.
 *
 * @see java.util.ArrayList
 *
 * @version 0.1.1
 * @author Larson Caldwell
 * @author Sam Graham
 * @author Haru McClellan
 */
public class SimCity
{
    //////////////////// Variables

    /**
     * The round number
     */
    private int mRound;
   
    /**
     * The Suimlators, representing the different rounds and thier changes
     */
    private ArrayList<Simulator> mName;

    //////////////////// Constructors

    /**
     * The list of simulators is instansiated. This constructor creates a list
     * of seven simulators.
     */
    public SimCity()
    {
	for(int i = 0; i < 7; i++)
	    {
		mName.add(new Simulator());
	    }
    }

    //////////////////// Methods

    /**
     * This method will run the program.  It will listen to the user and call
     * algorithms in the simulators.
     */
    public void run()
    {
      
    }

    /**
     * This method changes future rounds based on actions taken.
     */
    public void forecast()
    {
	for(int i = mRound; i < 7; i++)
	    {
		mName.get(i).getFossil().add(
					     mName.get(i).getFossil().getAmount());
						   //+ display.getFossilAmountChange);
		// and so on...
	    }
    }

    /**
     * Main starts the run method
     */
    public static void main(String[] args)
    {
	new SimCity().run();
    }
}