package ExercisesLevel2;

public class TooHot {

	public boolean isItHot(int tempeture, boolean isSummer) 
	{
		int upperLimit = 90;
		int lowerLimit = 60;
		if(isSummer == true) 
		{
			upperLimit = 100;
		}
		if(tempeture>lowerLimit && tempeture<upperLimit) 
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
}
