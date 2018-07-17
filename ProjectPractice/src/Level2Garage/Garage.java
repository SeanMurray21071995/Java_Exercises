package Level2Garage;

import java.util.ArrayList;

public class Garage {

	private ArrayList<Vehicle> garage = new ArrayList();
	
	
	public void getPriceList() 
	{
		for(Vehicle v: garage)
		{
			if(v.getType()=="Motorcycle") 
			{
				Motorcycle temp = (Motorcycle)v;
				if(temp.trickCapabilities==true) 
				{
					v.setTotalcost(v.getBasePrice()+v.getCosts()+150);
				}
			}
			else
			{
				v.setTotalcost(v.getBasePrice()+v.getCosts());
			}
		}
	}
	
	public void thePrice(int price, String type)
	{
		System.out.println("The price is: "+price+" for the: "+type);
	}
	
	public void addVehicle(Vehicle v) 
	{
		garage.add(v);
	}
	public void removeVehicle(int id) 
	{
		for(Vehicle v:garage) 
		{
			if(v.getId()==id) 
			{
				garage.remove(v);
			}
		}
	}
	public void empty() 
	{
		for(Vehicle v: garage) 
		{
			garage.remove(v);
		}
	}
}
