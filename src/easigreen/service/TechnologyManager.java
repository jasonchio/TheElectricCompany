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

    public void update()
    {
        for (int i = 0; i < implemented.size(); i++)
        {
            implemented.get(i).update();
        }
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