package Level2Garage;

public class Car extends Vehicle{
	String bootSize;	
	
	public Car(int Id, String bootsize, int costs){
		
		this.bootSize = bootsize;
		
		this.setCosts(costs);;
		this.setBasePrice(400);;
		this.setId(Id);
		this.setPassengerNumber(4);
		this.setSize("Medium");
		this.setType("Car");
		this.setWheels(4);
	}
	
}
