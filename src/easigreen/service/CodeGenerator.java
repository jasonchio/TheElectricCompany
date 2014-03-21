import java.util.ArrayList;
import java.lang.Math;

public class CodeGenerator
{
    //////////////////// Variables

    /**
     * the codes to be generated for each tech
     */
    private ArrayList<Integer> mTechnologies;

    /**
     * Codes are generated for each technology
     */
    public void generate(ArrayList<Technology> allTechnology)
    {
        for (int i = 0; i < allTechnology.size(); i++)
        {
            int newCode = (int)(Math.random() * 2000000000);
            mTechnologies.add(newCode);
        }
    }
}