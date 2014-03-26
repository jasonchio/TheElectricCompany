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
public class UpgradeManager
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
    private TechnologyManager mTechnologyManager;

    //////////////////// Constructors

    public UpgradeManager()
    {
        mNuclearSci   = 0;
        mFossilSci    = 0;
        mRenewableSci = 0;
        mOilSci       = 0;
        mNuclearEng   = 0;
        mFossilEng    = 0;
        mRenewableEng = 0;
        mOilDrilling  = 0;
        mLobby        = 0;
        mPriceChange  = 0;
        mTechnologyManager = new TechnologyManager();
    }

    //////////////////// Methods

    public UpgradeMerger update()
    {
        UpgradeMerger allChanges = mTechnologyManager.update();

        allChanges.addBudgetChange(mLobby);
        allChanges.addApprovalChange(mLobby * -1 + mPriceChange * -1);
        //allChanges.addEmissionsChange(mResourceManager.getEmitCredits());
        allChanges.addPriceChange(mPriceChange);
        //allChanges.addDemandChange(mResourceManager.getMarketShares());

        allChanges.addNuclearApproval(mNuclearSci + mNuclearEng);
        allChanges.addNuclearSecurity(mNuclearSci);

        allChanges.addFossilApproval(mFossilSci + mFossilEng);
        allChanges.addFossilSecurity(mFossilSci);

        allChanges.addRenewableApproval(mRenewableSci + mRenewableEng);
        allChanges.addRenewableSecurity(mRenewableSci);

        allChanges.addOilSecurity(mOilSci + mOilDrilling);
        allChanges.addOilGrowth(mOilDrilling);

        return allChanges;
    }

    /**
     * This will place action points into the fossil science upgrade
     *
     * @param actions the number of action points to be spent here
     */
    public void addFossilScience(int actions)
    {
        // mFossil.setApproval(mFossil.getApproval() + actions * .5);
        // mFossil.setSecurity(mFossil.getSecurity() + actions * .02);
        mFossilSci += actions;
    }

    /**
     * This will place action points into the nuclear science upgrade
     *
     * @param actions the number of action points to be spent here
     */
    public void addNuclearScience(int actions)
    {
        // mNuclear.setApproval(mNuclear.getApproval() + actions * .3);
        // mNuclear.setSecurity(mNuclear.getSecurity() + actions * .05);
        mNuclearSci += actions;
    }

    /**
     * This will place action points into the renewable science upgrade
     *
     * @param actions the number of action points to be spent here
     */
    public void addRenewableScience(int actions)
    {
        // mRenewable.setApproval(mRenewable.getApproval() + actions * .1);
        // mRenewable.setSecurity(mRenewable.getSecurity() + actions * .01);
        mRenewableSci += actions;
    }

    /**
     * This will place action points into the oil science upgrade
     *
     * @param actions the number of action points to be spent here
     */
    public void addOilScience(int actions)
    {
        // mOil.setSecurity(mOil.getSecurity() + actions * .8);
        mOilSci += actions;
    }

    /**
     * This will place action points into the fossil science engineering
     *
     * @param actions the number of action points to be spent here
     */
    public void addFossilEngineering(int actions)
    {
        // mFossil.setSecurity(mFossil.getSecurity() + actions * .08);
        mFossilEng += actions;
    }

    /**
     * This will place action points into the nuclear science engineering
     *
     * @param actions the number of action points to be spent here
     */
    public void addNuclearEngineering(int actions)
    {
        // mNuclear.setSecurity(mNuclear.getSecurity() + actions * .2);
        mNuclearEng += actions;
    }

    /**
     * This will place action points into the renewable science engineering
     *
     * @param actions the number of action points to be spent here
     */
    public void addRenewableEngineering(int actions)
    {
        // mRenewable.setSecurity(mRenewable.getSecurity() + actions * .03);
        mRenewableEng += actions;
    }

    /**
     * This will use action points to influence the price
     *
     * @param actions the number of action points to be spent here
     */
    public void addPriceChange(int actions)
    {
        //        mPrice    += (actions * .8);
        //        mApproval -= (actions * .5);
        mPriceChange += actions;
    }

    /**
     * This will use action points to lobby
     *
     * @param actions the number of action points to be spent here
     */
    public void addLobby(int actions)
    {
        //mBudget   += (actions * 1);
        //mApproval -= (actions * .5);
        mLobby += actions;
    }

    /**
     * This will use action points to influence oil drilling
     *
     * @param actions the number of action points to be spent here
     */
    public void addOilDrilling(int actions)
    {
        // mOil.setSecurity(mOil.getSecurity() + (actions * 1.5));
        // mOil.setConsumption(mOil.getConsumption() - (actions * .5));
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

    public TechnologyManager getTechnologyManager()
    {
        return mTechnologyManager;
    }
}
