package Level2Garage;

public class Truck extends Vehicle {
	
	int cargoCapacity;
	
	public Truck(int id, int cargoCapacity,  int costs) 
	{
		this.cargoCapacity = cargoCapacity;
		this.setCosts(costs);
		
		this.setId(id);
		this.setPassengerNumber(2);
		this.setBasePrice(500);
		this.setSize("Large");
		this.setType("Truck");
		this.setWheels(6);
		
	}

}
