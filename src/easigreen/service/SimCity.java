package easigreen.service;

import easigreen.system.*;
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
     * The Simulators, representing the different rounds and thier changes
     */
    private ArrayList<Round> mName;

    //////////////////// Constructors

    /**
     * The list of simulators is instantiated. This constructor creates a list
     * of seven simulators.
     */
    public SimCity()
    {
        // This is throwing a null pointer exception right now, and I need
        // This class for testing purposes.
        //for(int i = 0; i < 7; i++)
        //{
        //    mName.add(new Round());
        //}
    }

    //////////////////// Methods

    /**
     * This method will run the program.  It will listen to the user and call
     * algorithms in the simulators.
     */
    public void run()
    {
        Technology test1 = new Technology(-10, 2, -20,      // general
                                          5, 0, 0, 0, 0, 0, // fossil
                                          5, 0, 0, 0, 0, 0, // nuclear
                                          0, 0, 0, 0, 0, 0, // renewable
                                          0, 0, 0);         // oil
        mName.get(0).applyTechnology(test1);
    }

    /**
     * This method changes future rounds based on actions taken.
     */
    public void forecast()
    {
        for(int i = mRound; i < 7; i++) {
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
