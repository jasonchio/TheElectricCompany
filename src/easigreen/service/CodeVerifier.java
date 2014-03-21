import java.lang.Math;
import java.

/**
 * Checks to see if an input and a set code are the same number.
 *
 * @author Larson Caldwell
 * @author Haru McClellan
 * @author Sam Graham
 */
public class CodeVerifier
{
    /**
	 * 
	 */ 
    private int mCode;

	
    public void CodeVerifier()
	{
	}

    public boolean check(int input)
    {
	    if (mCode == input)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void setCode(int pCode)
    {
        mCode = pCode;
    }

    public int getCode()
    {
        return mCode;
    }
}