package parkingpack;

public class Truck extends Parking {
	static double price= basicprice*2.5;
	
	static void inparking() {
		int i=0;
		
		if(parkfree<2.5) {
			System.out.println("There are no parking place available for trucks!");
		} else {		
		parkfree = parkfree - 2.5;
		cash = cash + price;
		
		while(parking[i]!=0) {
			i++;
		}
		parking[i]=3;
		
		System.out.println("Your truck is in place #" + i + " and that is your number ticket, save it!");
		}
	}
	
	static void outparking(int ticket) {
		if(parking[ticket]==3) {
			parkfree = parkfree + 2.5;
			parking[ticket]=0;
		} else {
			System.out.println("Ticket number doesn't match!");
		}
	}
	
}
