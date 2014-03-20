import java.lang.Math;

/**
 * Checks to see if an imput and a set code are the same number.
 *
 * @author Larson Caldwell
 * @author Haru McClellan
 * @author Sam Graham
 */
public class CodeVerifier
{
    private int mCode;

    // can construct itself if ya want

    //public CodeVerifier()
    //{
    //    mCode = (Math().Random() * 1000);
    //}

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