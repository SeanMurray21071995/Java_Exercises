package ExercisesLevel2;

import java.util.ArrayList;

public class Intermediate {

	public static void main(String[] args) {
		
		//Black Jack
		BlackJack bj = new BlackJack();
		System.out.println(bj.checkTwentyOne(12,18));
		
		//Unique Numbers
		UniqueNumbers un = new UniqueNumbers();
		System.out.println(un.unique(3, 4, 5));
		
		//Too Hot?
		TooHot th = new TooHot();
		System.out.println(th.isItHot(95, false));
		
		//People 
		peopleStorage ps = new peopleStorage();
		ArrayList<Person> temp = ps.people;
		for(Person p :temp) 
		{
			System.out.println(p);
		}
		
		System.out.println((ps.thisPerson("Tommy")).name);
		
		 
		

	}

}
