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
		ArrayList<Person> people = new ArrayList(); 
		
		Person paul = new Person();
		paul.name="Paul";
		paul.age=34;
		paul.jobTitle="Supervisor";
		Person jane = new Person();
		jane.name ="Jane";
		jane.age=24;
		jane.jobTitle="Traniee";
		Person tommy = new Person();
		tommy.name="Tommy";
		tommy.age=27;
		tommy.jobTitle="Boss";
		
		people.add(paul);
		people.add(jane);
		people.add(tommy);
		
		for(Person p :people) 
		{
			System.out.println(p);
		}
		
		String lookFor= "Jane";
		
		for(Person p : people) 
		{
			String i = p.getName();
			if( i==lookFor) 
			{
				System.out.println(p);
			}
		}

	}

}
