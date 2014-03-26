package easigreen.service;

import easigreen.system.*;

/**
 * This class contains the default values for an unmodified nuclear plant.  It
 * will assign these values unless they are passed into the constructor.
 *
 * @version 0.1.1
 * @author Larson Caldwell
 * @author Sam Graham
 * @author Haru McClellan
 */
public class Nuclear
    extends Energy
{
    //////////////////// Variables

    /**
     * The number of plants
     */
    private int mAmount;

    /**
     * The cost to build each new plant
     */
    final private static double mCostBuild = 2.5;

    /**
     * The cost to remove each existing plant
     */
    final private static double mCostRemove = .5;

    /**
     * The approval rating per unit
     */
    final private static double mApproval = 35;

    /**
     * The power production per unit
     */
    final private static double mProduction = 1;

    /**
     * The emissions produced per unit
     */
    final private static double mEmissions = 0;

    /**
     * The security of each unit
     */
    final private static double mSecurity = 0;

    /**
     * The profit made with each unit
     */
    final private static double mProfitPercent = 50;

    //////////////////// Constructors

    /**
     * Sets default values to a nuclear plant
     */
    public Nuclear()
    {
        mAmount = 18;
    }
}
