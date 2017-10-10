package parking_plaza;

public class Cycle extends Bike {
	double length = 1.5;
	double width = 1.0;
	double coefficient_2 = length*width/2.0 ;
	
	price_ticket = price*coefficient_2;
	
	public void pay() {
		cash += price_ticket;
	}
}
