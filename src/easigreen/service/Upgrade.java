package easigreen.service;

import easigreen.system.*;

import java.util.ArrayList;

/**
 * The Simulator class contains information that each different type of plant
 * will use.  It will contain the number of a particular type of plant, the
 * cost for each one, and the impacts that it will have on the short-term and
 * long-term goals.
 *
 * @see java.util.ArrayList
 *
 * @version 0.1.2
 * @author Larson Caldwell
 * @author Sam Graham
 * @author Haru McClellan
 */
public class Upgrade
{
    //////////////////// Variables

    private int mNuclearSci;
    private int mFossilSci;
    private int mRenewableSci;
    private int mOilSci;
    private int mNuclearEng;
    private int mFossilEng;
    private int mRenewableEng;
    private int mOilDrilling;
    private int mLobby;
    private int mPriceChange;

    //////////////////// Methods

    /**
     * This will place action points into the fossil science upgrade
     *
     * @param actions the number of action points to be spent here
     */
    public void addFossilScience(int actions)
    {
        mFossilSci += actions;
    }

    /**
     * This will place action points into the nuclear science upgrade
     *
     * @param actions the number of action points to be spent here
     */
    public void addNuclearScience(int actions)
    {
        mNuclearSci += actions;
    }

    /**
     * This will place action points into the renewable science upgrade
     *
     * @param actions the number of action points to be spent here
     */
    public void addRenewableScience(int actions)
    {
        mRenewableSci += actions;
    }

    /**
     * This will place action points into the oil science upgrade
     *
     * @param actions the number of action points to be spent here
     */
    public void addOilScience(int actions)
    {
        mOilSci += actions;
    }

    /**
     * This will place action points into the fossil science engineering
     *
     * @param actions the number of action points to be spent here
     */
    public void addFossilEngineering(int actions)
    {
        mFossilEng += actions;
    }

    /**
     * This will place action points into the nuclear science engineering
     *
     * @param actions the number of action points to be spent here
     */
    public void addNuclearEngineering(int actions)
    {
        mNuclearEng += actions;
    }

    /**
     * This will place action points into the renewable science engineering
     *
     * @param actions the number of action points to be spent here
     */
    public void addRenewableEngineering(int actions)
    {
        mRenewableEng += actions;
    }

    /**
     * This will use action points to influence the price
     *
     * @param actions the number of action points to be spent here
     */
    public void addPriceChange(int actions)
    {
        mPriceChange += actions;
    }

    /**
     * This will use action points to lobby
     *
     * @param actions the number of action points to be spent here
     */
    public void addLobby(int actions)
    {
        mLobby += actions;
    }

    /**
     * This will use action points to influence oil drilling
     *
     * @param actions the number of action points to be spent here
     */
    public void addOilDrilling(int actions)
    {
        mOilDrilling += actions;
    }

    //////////////////// Getters

    public int getNuclearScience()
    {
	return mNuclearSci;
    }

    public int getFossilScience()
    {
        return mFossilSci;
    }

    public int getRenewableScience()
    {
        return mRenewableSci;
    }

    public int getOilScience()
    {
        return mOilSci;
    }

    public int getNuclearEngenering()
    {
        return mNuclearEng;
    }

    public int getFossilEngenering()
    {
        return mFossilEng;
    }

    public int getRenewableEngenering()
    {
        return mRenewableEng;
    }

    public int getOilDrilling()
    {
        return mOilDrilling;
    }

    public int getLobby()
    {
        return mLobby;
    }

    public int getPriceChange()
    {
        return mPriceChange;
    }
}
