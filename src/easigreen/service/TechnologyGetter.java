package easigreen.service;

import easigreen.system.*;
import java.io.*;
import java.util.ArrayList;

/**
 * Gets  a list of all the Technologies
 *
 * @author Sam Graham
 */
public class TechnologyGetter
{
    
    /**
     * The path prefix for the technology resource.
     */
    public static final String cTechFilename = "/resources/data/Technologies.csv";

    /**
     * Encapsulates getting the technologies from a resource file.
     */
    public ArrayList<Technology> getTechnologies()
    {
        ArrayList<Technology> tech = new ArrayList<Technology>();
		
		String line;
		
		try{
		   BufferedReader br = new BufferedReader(new InputStreamReader(ResourceGetter.getResourceAsStream(cTechFilename)));
		   while ((line = br.readLine()) != null)
		   {
		       String[] strArr = line.split(",");
			   String pName              = strArr[0];
			   double pNGRGrow           = Double.parseDouble(strArr[1].equals("")?"0":strArr[1]);
			   double pBudgetChange      = Double.parseDouble(strArr[2].equals("")?"0":strArr[2]);
               double pEmissionsChange   = Double.parseDouble(strArr[3].equals("")?"0":strArr[3]);
			   double pNpow              = Double.parseDouble(strArr[4].equals("")?"0":strArr[4]);
			   double pNcost             = Double.parseDouble(strArr[5].equals("")?"0":strArr[5]);
			   double pNatt              = Double.parseDouble(strArr[6].equals("")?"0":strArr[6]);
			   double pNemit             = Double.parseDouble(strArr[7].equals("")?"0":strArr[7]);
			   double pNsec              = Double.parseDouble(strArr[8].equals("")?"0":strArr[8]);
			   double pNprof             = Double.parseDouble(strArr[9].equals("")?"0":strArr[9]);
			   double pFpow              = Double.parseDouble(strArr[10].equals("")?"0":strArr[10]);
			   double pFcost             = Double.parseDouble(strArr[11].equals("")?"0":strArr[11]);
			   double pFatt              = Double.parseDouble(strArr[12].equals("")?"0":strArr[12]);
			   double pFemit             = Double.parseDouble(strArr[13].equals("")?"0":strArr[13]);
			   double pFsec              = Double.parseDouble(strArr[14].equals("")?"0":strArr[14]);
               double pFprof             = Double.parseDouble(strArr[15].equals("")?"0":strArr[15]);
			   double pRpow              = Double.parseDouble(strArr[16].equals("")?"0":strArr[16]);
			   double pRcost             = Double.parseDouble(strArr[17].equals("")?"0":strArr[17]);
               double pRatt              = Double.parseDouble(strArr[18].equals("")?"0":strArr[18]);
			   double pRemit             = Double.parseDouble(strArr[19].equals("")?"0":strArr[19]);
			   double pRsec              = Double.parseDouble(strArr[20].equals("")?"0":strArr[20]);
               double pRprof             = Double.parseDouble(strArr[21].equals("")?"0":strArr[21]);
			   double pOil               = Double.parseDouble(strArr[22].equals("")?"0":strArr[22]);
			   double pOilSec            = Double.parseDouble(strArr[23].equals("")?"0":strArr[23]);
               double pOilGrow           = Double.parseDouble(strArr[24].equals("")?"0":strArr[24]);
			   
               int pQuality              = 0;
               //Double.parseDouble(strArr[25]);
			   String pTec1 = strArr[25];
			   String pTec2 = strArr[26];
               String pTec3 = strArr[27];
			   String pTec4 = strArr[28];
			   String pTec5 = strArr[29];
               String pTec6 = strArr[30];
			   String pTec7 = strArr[31];
			   String pTec8 = strArr[32];
               String pTec9 = strArr[33];
			   String pTec10= strArr[34];
			   Technology newTech = new Technology(pBudgetChange, pNGRGrow, pEmissionsChange, pNpow, pNcost, pNatt, pNemit, pNsec, pNprof, pFpow, pFcost, pFatt, pFemit, pFsec, pFprof, pRpow, pRcost, pRatt, pRemit, pRsec, pRprof, pOil, pOilSec, pOilGrow, pQuality, pName, pTec1, pTec2, pTec3, pTec4, pTec5, pTec6, pTec7, pTec8, pTec9, pTec10);
			   tech.add(newTech);
		   }
		}
		catch (Exception e)
		{
		   e.printStackTrace();
		}
		
        return tech;
    }
}
