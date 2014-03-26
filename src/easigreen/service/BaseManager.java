package easigreen.service;

/**
 * The BaseManager Manages Base Values
 *
 * @version 0.1.2
 * @author Larson Caldwell
 * @author Sam Graham
 * @author Haru McClellan
 */
public class BaseManager
{
    //////////////////// Variables

    /**
     * The current round number
     */
    private int mRoundNumber;

    /**
     * The Default budget
     */
    private static final double mBudget = 9;

    /**
     * The Default demand
     */
    private static final double mDemand = 100;


    //////////////////// Constructors

    /**
     * Constructor
     */
    public BaseManager()
    {
	mRoundNumber = 0;
    }

    /**
     * Increases the round Number
     */
    public void nextRound()
    {
	mRoundNumber++;
    }

    /**
     * Increases the round Number
     * @param pRound the round to set to
     */
    public void setRound(int pRound)
    {
	mRoundNumber = pRound;
    }

    /**
     * Get the round Number
     * @return mRoundNumber the current round number
     */
    public int getRound()
    {
	return mRoundNumber;
    }

    /**
     * Get this rounds budget
     * @return mBudget the current rounds budget
     */
    public double getBudget()
    {
	return mBudget + (double)(mRoundNumber * 15);
    }
    
    /**
     * Get this rounds demand
     * @return mDemand the current rounds demand
     */
    public double getDemand()
    {
	return mDemand + (double)(mRoundNumber * 5);
    }
}
