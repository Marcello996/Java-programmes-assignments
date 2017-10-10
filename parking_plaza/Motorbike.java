package parking_plaza;

public class Motorbike extends Bike {
	double length = 2.0;
	double width = 1.5;
	double coefficient_2 = length*width/2.0 ;
	
	price_ticket = price*coefficient_2;
	
	public void pay() {
		cash += price_ticket;
	}
}
