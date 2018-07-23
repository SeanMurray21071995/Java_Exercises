package workingWithFiles;

public class Person {
	
	private String Name;
	private int Age ;
	private String Occupation;
	
	Person(String name, int age, String occupation)
	{
		this.Name=name;
		this.Age=age;
		this.Occupation=occupation;
		
	}
	
	public String getName() 
	{
		return this.Name;
	}
	public void setName(String name) 
	{
		this.Name=name;
	}
	public int getAge()
	{
		return this.Age;
	}
	public void setAge(int age) 
	{
		this.Age=age;
	}
	public String getOccupation() 
	{
		return this.Occupation;
	}
	public void setOccupation(String occupation) 
	{
		this.Occupation=occupation; 
	}
}
