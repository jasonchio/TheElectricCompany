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
public class TradeManager
{
    //////////////////// Variables

    /**
     * The technology manager
     */
    private TechnologyManager mTechnologyManager;

    /**
     * The recource manager
     */
    private ResourceManager mResourceManager;

    //////////////////// Getters

    /**
     * Gets the technology manager
     *
     * @return pTechnologyManager the technology manager
     */
    public TechnologyManager getTechnologyManager()
    {
	return mTechnologyManager;
    }

    /**
     * Gets the resource manager
     *
     * @return pResourceManager the new recource manager
     */
    public ResourceManager getResourceManager()
    {
	return mResourceManager;
    }

    //////////////////// Setters

    /**
     * Sets the technology manager to a new value
     *
     * @param pTechnologyManager the new technology manager
     */
    public void setTechnologyManager(TechnologyManager pTechnologyManager) 
    { 
	mTechnologyManager = pTechnologyManager;
    }

    /**
     * Sets the resource manager to a new value
     *
     * @param pResourceManager the new resource manager
     */
    public void setResourceManager(ResourceManager pResourceManager)
    {
	mResourceManager = pResourceManager;
    }
}