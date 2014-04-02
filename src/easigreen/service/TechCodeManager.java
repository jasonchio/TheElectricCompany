package easigreen.service;

import easigreen.service.*;
import easigreen.system.*;

import java.util.*;

/**
 * This class is used to map codes to technologies
 */
class TechCodeManager
{
    /**
     * The maximum number a code can be
     */
    private static final int MAX = 2000000000;

    /**
     * Holds a map of strings(codes) to technologies
     */
    private Map<String, Technology> mCodes;

    /**
     * Reference to the list of all technologies
     */
    private List<Technology> mTechs;

    /**
     * Constructor
     * @param List-Technology pTechs, from Technology Manager
     */
    public TechCodeManager(List<Technology> pTechs)
    {
	mTechs = pTechs;
	mCodes = new HashMap<String, Technology>();
	generateCodes();
    }

    /**
     * Generates new codes for all technologies
     */
    private void generateCodes()
    {
	String code = "0";
	for (Technology tech : mTechs)
	{
	    for (int i = 1; i <= 10; i++)
	    {
		code = getNewCode();
		Technology newTech = TechCloner.getClone(tech);
		tech.setCode(code);
		tech.setQuality(i);
		mCodes.put(code, tech);
	    }
	}
    }

    /**
     * Creates a new code for a used technology
     * @param String pCode, the used code
     */
    private void regenerate(String pCode)
    {
	Technology tech = mCodes.get(pCode);
	mCodes.remove(pCode);
	String newCode = getNewCode();
	tech.setCode(newCode);
	mCodes.put(newCode, tech);
    }

    /**
     * Generates a new code
     * @return the new code
     */
    private String getNewCode()
    {
	return ("" + (Math.random() * MAX));
    }

    /**
     * Uses a string code as a key to look up a technology
     * @param String pCode the code to check
     * @return Technology tech the associated technology
     */
    public Technology getTech(String pCode)
    {
	Technology tech = mCodes.get(pCode);
	if (tech != null)
	{
	    regenerate(pCode);
	}
	return tech;
    }
}
