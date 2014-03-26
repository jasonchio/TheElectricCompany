package easigreen.service;

import java.util.ArrayList;

/**
 * The Trade Manager class.
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
    private ArrayList<Technology> implemented;

    /**
     * The available technologies
     */
    private ArrayList<Technology> available;

    /**
     * All of the technologies  
     */
    private ArrayList<Technology> all;

    //////////////////// Methods

    public UpgradeMerger update()
    {
        UpgradeMerger allChanges = new UpgradeMerger();
        for (int i = 0; i < implemented.size(); i++)
	{
	    // General
            allChanges.setBudgetChange(allChanges.getBudgetChange() 
               + implemented.get(i).getBudgetChange());

	    allChanges.setDemandRateChange(allChanges.getDemandRateChange()
               + implemented.get(i).getNRGChange());

	    allChanges.setEmissionsChange(allChanges.getEmissionsChange()
	       + implemented.get(i).getEmissionsChange());

	    // Nuclear
	    allChanges.setNuclearPower(allChanges.getNuclearPower()
               + implemented.get(i).getNpow());

	    allChanges.setNuclearCost(allChanges.getNuclearCost()
	       + implemented.get(i).getNcost());

	    allChanges.setNuclearApproval(allChanges.getNuclearApproval()
      	       + implemented.get(i).getNatt());

	    allChanges.setNuclearEmissions(allChanges.getNuclearEmissions()
	       + implemented.get(i).getNemit());

	    allChanges.setNuclearSecurity(allChanges.getNuclearSecurity()
     	       + implemented.get(i).getNsec());

	    allChanges.setNuclearProfit(allChanges.getNuclearProfit()
               + implemented.get(i).getNprof());

	    // Fossil
	    allChanges.setFossilPower(allChanges.getFossilPower()
	       + implemented.get(i).getFpow());

            allChanges.setFossilCost(allChanges.getFossilCost()
   	       + implemented.get(i).getFcost());

            allChanges.setFossilApproval(allChanges.getFossilApproval()
      	       + implemented.get(i).getFatt());

            allChanges.setFossilEmissions(allChanges.getFossilEmissions()
	       + implemented.get(i).getFemit());

            allChanges.setFossilSecurity(allChanges.getFossilSecurity()
	       + implemented.get(i).getFsec());

            allChanges.setFossilProfit(allChanges.getFossilProfit()
       	       + implemented.get(i).getFprof());

	    // Renewable
	    allChanges.setRenewablePower(allChanges.getRenewablePower()
	       + implemented.get(i).getRpow());

            allChanges.setRenewableCost(allChanges.getRenewableCost()
	       + implemented.get(i).getRcost());

            allChanges.setRenewableApproval(allChanges.getRenewableApproval()
	       + implemented.get(i).getRatt());

            allChanges.setRenewableEmissions(allChanges.getRenewableEmissions()
	       + implemented.get(i).getRemit());

            allChanges.setRenewableSecurity(allChanges.getRenewableSecurity()
	       + implemented.get(i).getRsec());

            allChanges.setRenewableProfit(allChanges.getRenewableProfit()
	       + implemented.get(i).getRprof());

	    // Oil
	    allChanges.setOilConsumption(allChanges.getOilConsumption()
	       + implemented.get(i).getOil());

            allChanges.setOilSecurity(allChanges.getOilSecurity()
	       + implemented.get(i).getOilSec());

	    allChanges.setOilGrowth(allChanges.getOilGrowth()
	       + implemented.get(i).getOilGrow());
	}
	/**
	UpgradeMerger oneSet = new UpgradeMerger();
        for (int i = 0; i < implemented.size(); i++)
        {
            oneSet.setBudgetChange(oneSet.getBudgetChange() 
                                   + implemented.get(i).update()
                                     .getBudgetChange());

	    oneSet.setDemandRateChange(oneSet.getDemandRateChange()
                                       + implemented.get(i).update()
				         .getDemandRateChange());

	    oneSet.setEmissionsChange(oneSet.getEmissionsChange()
                                       + implemented.get(i).update()
				       .getEmissionsChange());

	    oneSet.setNpow(oneSet.getNpow()
                           + implemented.get(i).update().getNpow());

	    oneSet.setNcost(oneSet.getNcost()
                            + implemented.get(i).update().getNcost());

	    oneSet.setNatt(oneSet.getNatt()
                           + implemented.get(i).update().getNatt());

	    oneSet.setNemit(oneSet.getNemit()
                            + implemented.get(i).update().getNemit());

	    oneSet.setNsec(oneSet.getNsec()
                           + implemented.get(i).update().getNsec());

	    oneSet.setNprof(oneSet.getNprof()
                           + implemented.get(i).update().getNprof());

	    oneSet.setFpow(oneSet.getFpow()
                           + implemented.get(i).update().getFpow());

            oneSet.setFcost(oneSet.getFcost()
                            + implemented.get(i).update().getFcost());

            oneSet.setFatt(oneSet.getFatt()
                           + implemented.get(i).update().getFatt());

            oneSet.setFemit(oneSet.getFemit()
                            + implemented.get(i).update().getFemit());

            oneSet.setFsec(oneSet.getFsec()
                           + implemented.get(i).update().getFsec());

            oneSet.setFprof(oneSet.getFprof()
			    + implemented.get(i).update().getFprof());

	    oneSet.setRpow(oneSet.getRpow()
                           + implemented.get(i).update().getRpow());

            oneSet.setRcost(oneSet.getRcost()
                            + implemented.get(i).update().getRcost());

            oneSet.setRatt(oneSet.getRatt()
                           + implemented.get(i).update().getRatt());

            oneSet.setRemit(oneSet.getRemit()
                            + implemented.get(i).update().getRemit());

            oneSet.setRsec(oneSet.getRsec()
                           + implemented.get(i).update().getRsec());

            oneSet.setRprof(oneSet.getRprof()
			    + implemented.get(i).update().getRprof());

	    oneSet.setOil(oneSet.getOil()
                            + implemented.get(i).update().getOil());

	    oneSet.setOilSec(oneSet.getOilSec()
			  + implemented.get(i).update().getOilSec());

	    oneSet.setOilGrow(oneSet.getOilGrow()
			  + implemented.get(i).update().getOilGrow());
	}
	*/
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
	return implemented;
    }

    /**
     * Gets the available technologies
     *
     * @return available the available technologies
     */
    public ArrayList<Technology> getAvalible()
    {
        return available;
    }

    /**
     * Gets all technologies
     *
     * @return all all of the technologies
     */
    public ArrayList<Technology> getAll()
    {
        return all;
    }

    //////////////////// Setters

    /**
     * Sets the implemented technologies
     *
     * @param pImplemented the new implemented technologies
     */
    public void setImplemented(ArrayList<Technology> pImplemented)
    {
        implemented = pImplemented;
    }

    public void implementTechnology(Technology pTech)
    {
	implemented.add(pTech);
    }

    /**
     * Sets the available technologies
     *
     * @param pAvailable the new available technologies
     */
    public void setAvalible(ArrayList<Technology> pAvailable)
    {
        available = pAvailable;
    }

    public void addTechnology(Technology pTech)
    {
	available.add(pTech);
    }

    /**
     * Sets all technologies
     *
     * @param pAll all of the new technologies
     */
    public void setAll(ArrayList<Technology> pAll)
    {
        all = pAll;
    }
}
