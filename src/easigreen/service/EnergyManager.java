package easigreen.service;

/**
 * The EnergyManager Manages Energy
 *
 * @version 0.1.0
 * @author Larson Caldwell
 * @author Sam Graham
 * @author Haru McClellan
 */
public class EnergyManager
{
    //////////////////// Variables

    /**
	 * The Manager of Energy
	 */
	private UpgradeManager mUpgradeManager;
	
	/**
	 * The Nuclear Plant Object
	 */
	private Nuclear mNuclear;
	
	/**
	 * The Fossil Plant Object
	 */
	private Fossil mFossil;
	
	/**
	 * The Renewable Plant Object
	 */
	private Renewable mRenewable;
	
	/**
	 * The Oil Object
	 */
	private Oil mOil;
	
	public EnergyManager(UpgradeManager pUpgradeManager)
	{
           mUpgradeManager = pUpgradeManager;
	   mNuclear        = new Nuclear();
	   mFossil         = new Fossil();
	   mRenewable      = new Renewable();
	   mOil            = new Oil();
	}
}