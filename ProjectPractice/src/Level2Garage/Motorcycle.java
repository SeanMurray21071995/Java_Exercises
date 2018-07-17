package Level2Garage;

public class Motorcycle extends Vehicle {
	
	boolean trickCapabilities;
	
	public Motorcycle(int id, boolean trickCapabilities, int costs)
	{

		this.trickCapabilities = trickCapabilities;
		
		this.setCosts(costs);
		this.setId(id);
		this.setPassengerNumber(2);
		this.setBasePrice(200);;
		this.setSize("small");
		this.setType("Motorcyle");
		this.setWheels(2);
		
		
	}
}
