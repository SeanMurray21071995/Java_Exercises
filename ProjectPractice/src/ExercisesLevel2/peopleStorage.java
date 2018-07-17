package ExercisesLevel2;

import java.util.ArrayList;

public class peopleStorage {
	
	ArrayList<Person> people = new ArrayList();
	
	
	public peopleStorage(){
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
	}
	
	
	
	public Person thisPerson(String lookFor) {
		for(Person p : people) 
		{	
			String i = p.getName();
			if( i==lookFor) 
			{
				return p;
			}	
		}
		return null;
		}

}
