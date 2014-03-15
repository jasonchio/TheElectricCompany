/**
 * This class contains information about a specific round.  This information
 * is stored as a simulator to be accessed at anytime.
 *
 * @version 0.1.1
 * @author Larson Caldwell
 * @author Sam Graham
 * @author Haru McClellan
 */
public class RoundInformation
{
    //////////////////// Variables

    /**
     * The round that this is
     */
    private int mRoundNumber;

    /**
     * The simulator being stored
     */
    private Simulator mSimulator;

    //////////////////// Constructors
   
    /**
     * Sets round number to a specified value.
     *
     * @param pRoundNumber the round being instantiated
     */
    public RoundInformation(int pRoundNumber)
    {
        mRoundNumber = pRoundNumber;
    }

    //////////////////// Getters

    /**
     * Get the round number
     *
     * @return mRoundNumber the round number
     */
    public int getRoundNumber()
    {
	return mRoundNumber;
    }

    /**
     * Get the simulator
     *
     * @return mSimulator
     */
    public Simulator getSimulator()
    {
        return mSimulator;
    }

    //////////////////// Setters

    /**
     * Set the simulator to and existing one
     *
     * @param pSimulator the existing simulator to be stored
     */
    public void setSimulator(Simulator pSimulator)
    {
	mSimulator = pSimulator;
    }
}