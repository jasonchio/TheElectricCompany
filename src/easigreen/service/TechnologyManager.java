package easigreen.service;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

/**
 * The Technology Manager class.
 *
 * @see java.util.ArrayList
 *
 * @version 0.1.2
 * @author Larson Caldwell
 * @author Sam Graham
 * @author Haru McClellan
 */
public class TechnologyManager
{
    //////////////////// Variables

    /**
     * The implemented technologies
     */
    private ArrayList<Technology> mImplemented;

    /**
     * The available technologies
     */
    private ArrayList<Technology> mAvailable;

    /**
     * All of the technologies
     */
    private ArrayList<Technology> mAll;

    /**
     * An alternate data structure for holding available techs
     * so they can be referenced by their name
     */
    private Map<String, Technology> mNames;

    private TechCodeManager mCodes;

    /**
     * Basic constructor of the array lists
     */
    public TechnologyManager()
    {
        mImplemented = new ArrayList<Technology>();
        mAvailable   = new ArrayList<Technology>();
        mAll         = new TechnologyGetter().getTechnologies();
	mCodes       = new TechCodeManager(mAll);
	mNames       = new HashMap<String, Technology>();
    }


    //////////////////// Methods

    /**
     * Updates the Merger
     * @returns UpgradeMerger the UpgradeMerger
     */
    public UpgradeMerger update()
    {
        UpgradeMerger allChanges = new UpgradeMerger();
        for (int i = 0; i < mImplemented.size(); i++) {
            // General
            allChanges.addBudgetChange      (mImplemented.get(i).getOther().getBudget   ());
            allChanges.addDemandRateChange  (mImplemented.get(i).getOther().getDemand   ());
            allChanges.addEmissionsChange   (mImplemented.get(i).getOther().getEmissions());
            // Nuclear
            allChanges.addNuclearPower      (mImplemented.get(i).getNuclear().getPower    ());
            allChanges.addNuclearCost       (mImplemented.get(i).getNuclear().getCost     ());
            allChanges.addNuclearApproval   (mImplemented.get(i).getNuclear().getApproval ());
            allChanges.addNuclearEmissions  (mImplemented.get(i).getNuclear().getEmissions());
            allChanges.addNuclearSecurity   (mImplemented.get(i).getNuclear().getSecurity ());
            allChanges.addNuclearProfit     (mImplemented.get(i).getNuclear().getProfit   ());
            // Fossil
            allChanges.addFossilPower       (mImplemented.get(i).getFossil().getPower    ());
            allChanges.addFossilCost        (mImplemented.get(i).getFossil().getCost     ());
            allChanges.addFossilApproval    (mImplemented.get(i).getFossil().getApproval ());
            allChanges.addFossilEmissions   (mImplemented.get(i).getFossil().getEmissions());
            allChanges.addFossilSecurity    (mImplemented.get(i).getFossil().getSecurity ());
            allChanges.addFossilProfit      (mImplemented.get(i).getFossil().getProfit   ());
            // Renewable
            allChanges.addRenewablePower    (mImplemented.get(i).getRenewable().getPower    ());
            allChanges.addRenewableCost     (mImplemented.get(i).getRenewable().getCost     ());
            allChanges.addRenewableApproval (mImplemented.get(i).getRenewable().getApproval ());
            allChanges.addRenewableEmissions(mImplemented.get(i).getRenewable().getEmissions());
            allChanges.addRenewableSecurity (mImplemented.get(i).getRenewable().getSecurity ());
            allChanges.addRenewableProfit   (mImplemented.get(i).getRenewable().getProfit   ());
            // Oil
            allChanges.addOilConsumption    (mImplemented.get(i).getOil().getConsumption());
            allChanges.addOilSecurity       (mImplemented.get(i).getOil().getSecurity   ());
            allChanges.addOilGrowth         (mImplemented.get(i).getOil().getGrowth     ());
        }
        return allChanges;
    }


    //////////////////// Getters

    /**
     * Gets the implemented technologies
     *
     * @return implemented the implemented technologies
     */
    public ArrayList<Technology> getImplemented()
    {
        return mImplemented;
    }

    /**
     * Gets the available technologies
     *
     * @return available the available technologies
     */
    public ArrayList<Technology> getAvailable()
    {
        return mAvailable;
    }

    /**
     * Gets all technologies
     *
     * @return all all of the technologies
     */
    public ArrayList<Technology> getAll()
    {
        return mAll;
    }

    //////////////////// Setters

    /**
     * Sets the implemented technologies
     *
     * @param pImplemented the new implemented technologies
     */
    public void setImplemented(ArrayList<Technology> pImplemented)
    {
        mImplemented = pImplemented;
    }

    /**
     * Gets a technology from a name
     * @param techName the name of the tech to get
     * @return tech the technology associated with the name
     */
    public Technology getTechnology(String techName)
    {
	return mNames.get(techName);
    }

    /**
     * Implements a given technology
     * @param pTech the technology to implement
     */
    public void implementTechnology(Technology pTech)
    {
        mImplemented.add(pTech);
    }

    /**
     * Returns true if the technology is implemented
     * @param pTech the technology to check
     * @return isTrue whether or not the technology is implemented
     */
    public boolean isImplemented(Technology pTech)
    {
	boolean isTrue = false;
	for (Technology t : mImplemented)
	{
	    if (t == pTech)
	    {
		isTrue = true;
		break;
	    }
	}
	return isTrue;
    }

    /**
     * Sets the available technologies
     *
     * @param pAvailable the new available technologies
     */
    public void setAvailable(ArrayList<Technology> pAvailable)
    {
        mAvailable = pAvailable;
	for (Technology tech : mAvailable)
	{
	    mNames.put(tech.getName() + tech.getQuality(), tech);
	}
    }

    /**
     * Adds a Technology
     * @param pTech a Technology
     */
    public void addTechnology(Technology pTech)
    {
        mAvailable.add(pTech);
	mNames.put(pTech.getName() + pTech.getQuality(), pTech);
    }

    /**
     * Adds a technology from a code
     * @param pCode String holding the code for the technology
     */
    public void addTechnology(String pCode)
    {
	Technology newTech = mCodes.getTech(pCode);
	if (newTech != null)
	{
	    mAvailable.add(newTech);
	    mNames.put(newTech.getName() + newTech.getQuality(), newTech);
	}
    }

    /**
     * Sets all technologies
     *
     * @param pAll all of the new technologies
     */
    public void setAll(ArrayList<Technology> pAll)
    {
        mAll = pAll;
    }
}
