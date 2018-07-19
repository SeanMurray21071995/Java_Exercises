package Level2Garage;

public class Main {

	public static void main(String[] args) {
		
		Garage localGarage = new Garage();
		Car beatle = new Car(1,"Large",300);
		Motorcycle magicBike = new Motorcycle(2,true, 455);
		
		localGarage.addVehicle(beatle);
		localGarage.addVehicle(magicBike);		
		localGarage.getPriceList();
	}
}
