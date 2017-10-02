package parkingpack;

public class Motorbike extends Parking {
	static double price= basicprice*(0.75);

	static void inparking() {
		int i=0;
		
		if(parkfree<0.75) {
			System.out.println("There are no parking place available!");
		} else {		
		parkfree = parkfree - 0.75;
		cash = cash + price;
		
		while(parking[i]!=0) {
			i++;
		}
		parking[i]=2;
		
		System.out.println("Your motorbike is in place #" + i + " and that is your number ticket, save it!");
		}
	}
	
	static void outparking(int ticket) {
		if(parking[ticket]==2) {
			parkfree = parkfree + 0.75;
			parking[ticket]=0;
		} else {
			System.out.println("Ticket number doesn't match!");
		}
	}
	
}
