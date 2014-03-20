import java.lang.Math;

public class CodeVerifier
{
    private int mCode;

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