package workingWithFiles;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Person paul = new Person("Paul",47,"Dentist");
		Person natalie = new Person("Natalie",24,"Horse Trainer");
		Person robert = new Person("Robert",31,"Mariner");
		Person eilidh = new Person ("Eilidh", 27, "Accountant");
		Person torin = new Person("Torin", 25, "Receptionist");
		ArrayList<Person> peopleList = new ArrayList();
		peopleList.add(paul);
		peopleList.add(natalie);
		peopleList.add(robert);
		peopleList.add(eilidh);
		peopleList.add(torin);
		
		BufferedWriter bw;
		
	}

}
