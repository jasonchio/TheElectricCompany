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
     * The avalible technologies
     */
    private ArrayList<Technology> avalible;

    /**
     * All of the technologies  
     */
    private ArrayList<Technology> all;

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
     * Gets the avalible technologies
     *
     * @return avalible the avalible technologies
     */
    public ArrayList<Technology> getAvalible()
    {
        return avalible;
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

    /**
     * Sets the avalible technologies
     *
     * @param pAvalible the new avalible technologies
     */
    public void setAvalible(ArrayList<Technology> pAvalible)
    {
        avalible = pAvalible;
    }

    /**
     * Sets all technologies
     *
     * @return all all of the new technologies
     */
    public void setAll(ArrayList<Technology> pAll)
    {
        all = pAll;
    }
}