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
    final private int mAmount;

    /**
     * The cost to build each new plant
     */
    final private double mCostBuild;

    /**
     * The cost to remove each existing plant
     */
    final private double mCostRemove;

    /**
     * The approval rating per unit
     */
    final private double mApproval;

    /**
     * The power production per unit
     */
    final private double mProduction;

    /**
     * The emissions produced per unit
     */
    final private double mEmissions;

    /**
     * The security of each unit
     */
    final private double mSecurity;

    /**
     * The profit made with each unit
     */
    final private double mProfitPercent;

    //////////////////// Constructors

    /**
     * Sets default values to a nuclear plant
     */
    public Nuclear()
    {
        mAmount = 18;
        mCostBuild = 2.5;
        mCostRemove = .5;
        mApproval = 35;
        mProduction = 1;
        mEmissions = 0;
        mSecurity = 0;
        mProfitPercent = 50;
    }
}
