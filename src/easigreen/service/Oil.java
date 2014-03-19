
package easigreen.service;

import easigreen.system.*;

/**
 * The oil class contains information about the current oil status.  This
 * includes oil security, consumption and emissions.  These values can be
 * adjusted through
 *
 * @version 0.1.1
 * @author Larson Caldwell
 * @author Sam Graham
 * @author Haru McClellan
 */
public class Oil
{
    //////////////////// Variables

    /**
     * Daily consumption of oil
     */
    private double mConsumption;

    /**
     * Security rating of oil
     */
    private double mSecurity;

    /**
     * Oil growth per round
     */
    private double mGrowth;

    //////////////////// Constructors

    /**
     * Default values for oil
     */
    public Oil()
    {
        mConsumption = 1.7;
        mSecurity = -17;
        mGrowth = 20;
    }

    //////////////////// Methods

    /**
     * Gets the daily consumption of oil
     *
     * @return mConsumption the daily consumption of oil
     */
    public double getConsumption()
    {
        return mConsumption;
    }

    /**
     * Gets the security rating of oil
     *
     * @return mSecurity the security rating of oil
     */
    public double getSecurity()
    {
        return mSecurity;
    }

    /**
     * Gets the growth of oil per round
     *
     * @return mGrowth the growth of oil per round
     */
    public double getGrowth()
    {
        return mGrowth;
    }

    /**
     * Sets the daily consumption of oil
     *
     * @param pConsumption the new daily consumption of oil
     */
    public void setConsumption(double pConsumption)
    {
        mConsumption = pConsumption;
    }

    /**
     * Sets the security rating of oil
     *
     * @param pSecurity the new security rating of oil
     */
    public void setSecurity(double pSecurity)
    {
        mSecurity = pSecurity;
    }

    /**
     * Sets the growth of oil per round
     *
     * @param pGrowth the new growth of oil per round
     */
    public void setGrowth(double pGrowth)
    {
        mGrowth = pGrowth;
    }
}
