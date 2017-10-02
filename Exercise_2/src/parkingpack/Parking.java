package parkingpack;

public class Parking {
	static double parkfree=10;
	static double basicprice=2.00;
	static int parking[] = new int[300];
	static double cash=0;
	
	static void printcash() {
		System.out.println("The parking earned €"+ cash);
	}
	
	static void printparkingfree() {
		if(parkfree>=2.5) {
			System.out.print("There is "+ parkfree/.1 + "% of places available! ");
			System.out.println("Trucks, cars and motorbikes can enter.");
		} else if(parkfree>=1) {
			System.out.print("There is "+ parkfree/.1 + "% of places available! ");
			System.out.println("Only cars or motorbikes can enter.");
		} else if(parkfree>=0.75){
			System.out.print("There is "+ parkfree/.1 + "% of places available! ");
			System.out.println("Only a motorbike can enter.");
		} else {
			System.out.println("The parking is full!");
		}
	}
	
	public static void main(String[] args) {
		
		Car.inparking();
		Motorbike.inparking();
		Car.inparking();
		Truck.inparking();
		Car.outparking(2);
		Car.printcash();
		Car.printparkingfree();
		Truck.inparking();
		Car.inparking();
		Car.printparkingfree();
		Car.inparking();
		Car.outparking(0);
		Truck.printparkingfree();
		Motorbike.inparking();
		Car.printparkingfree();
		Car.printcash();
	}

}
