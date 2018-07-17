
public class Practice {
	public static String shout(String original)
	{
		return original+" 1" ;
	}
	
	public static int add(int a, int b) 
	{
		int c = a+b;
	    return c;
	}
	
	public static int addMulti(boolean boo, int a, int b) 
	{
		int c = 0;
		if(boo==true) 
		{
			c = a+b;
		}
		else 
		{
			c = a*b;
		}
		return c;
	}
	
	public static int addMultiElseZero(boolean boo, int a, int b) 
	{
		int c = 0;
		if(a==0)
		{
			return b;
	
		}
		else if (b==0) 
		{
			return a;
		}
		if(boo==true) 
		{
			c = a+b;
		}
		else 
		{
			c = a*b;
		}

		return c;
	}

}
