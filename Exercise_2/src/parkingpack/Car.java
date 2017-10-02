package parkingpack;

public class Car extends Parking {
	static double price= basicprice;	
	
	static void inparking() {
		int i=0;
		
		if(parkfree<1) {
			System.out.println("There are no parking place available for cars!");
		} else {
		parkfree = parkfree - 1;
		cash = cash + price;
		
		while(parking[i]!=0) {
			i++;
		}
		parking[i]=1;
		
		System.out.println("Your car is in place #" + i + " and that is your number ticket, save it!");
		}
	}
	
	static void outparking(int ticket) {
		if(parking[ticket]==1) {
			parkfree = parkfree + 1;
			parking[ticket]=0;
		} else {
			System.out.println("Ticket number doesn't match!");
		}
	}
	
}
