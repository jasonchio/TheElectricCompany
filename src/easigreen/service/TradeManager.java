package easigreen.service;

/**
 * The Trade Manager class.
 *
 * @version 0.1.1
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
     * The resource manager
     */
    private ResourceManager mResourceManager;

    /**
     * The Constructor for this class
     *
     * @param pTechnologyManager the technology manager
     * @param pResourceManager   the resource manager
     */
    public TradeManager(TechnologyManager pTechnologyManager,
                        ResourceManager pResourceManager)
    {
        mTechnologyManager = pTechnologyManager;
        mResourceManager   = pResourceManager;
    }

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
     * @return pResourceManager the new resource manager
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