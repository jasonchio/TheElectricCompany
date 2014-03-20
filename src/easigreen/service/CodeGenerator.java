import java.util.ArrayList;

public class CodeGenerator
{
    //////////////////// Variables

    /**
     * the codes to be generated for each tech
     */
    private ArrayList<int> mTechnologies;

    /**
     * Codes are generated for each technology
     */
    public void generate(ArrayList<Technology> allTechnology)
    {
        for (int i = 0, i < allTechnology.size(), i++)
        {
            int newCode = Math().Random() * 2000000000;
            mTechnologies.add(newCode);
        }
    }
}