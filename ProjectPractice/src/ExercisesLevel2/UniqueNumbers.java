package ExercisesLevel2;

public class UniqueNumbers {
	
	public int unique(int a, int b, int c) 
	{
		if(a==c) 
		{
			return b;
		}
		else if(a==b) 
		{
			return c;
		}
		else if(c==b) 
		{
			return a;
		}
		else if(a==b && b==c) 
		{
			return 0;
		}
		else 
		{
			return a+b+c;
		}		
	}

}
