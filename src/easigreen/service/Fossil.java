package easigreen.service;

import easigreen.system.*;

/**
 * This class contains the default values for an unmodified fossil plant.  It
 * will assign these values unless they are passed into the constructor.
 *
 * @version 0.1.1
 * @author Larson Caldwell
 * @author Sam Graham
 * @author Haru McClellan
 */
public class Fossil
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
    final private static double mCostBuild = 1;

    /**
     * The cost to remove each existing plant
     */
    final private static double mCostRemove = .1;

    /**
     * The approval rating per unit
     */
    final private static double mApproval = 50;

    /**
     * The power production per unit
     */
    final private static double mProduction = .65;

    /**
     * The emissions produced per unit
     */
    final private static double mEmissions = 2;

    /**
     * The security of each unit
     */
    final private static double mSecurity = .09;

    /**
     * The profit made with each unit
     */
    final private static double mProfitPercent = 45;

    //////////////////// Constructors

    /**
     * Sets default values to a fossil plant.
     */
    public Fossil()
    {
        mAmount = 100;
    }
}
