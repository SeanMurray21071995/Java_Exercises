package ExercisesLevel2;

public class BlackJack {
	
	public int checkTwentyOne(int a, int b) 
	{
		if(a>21 && b>21) 
		{
			return 0;
		}
		else if((21-a) <(21-b)) 
		{
			return a;
		}
		else if((21-b)<(21-a)) 
		{
			return b;
		}
		return 0;
	}

}
