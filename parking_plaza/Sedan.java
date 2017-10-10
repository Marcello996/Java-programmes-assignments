package parking_plaza;

public class Sedan extends Car {
	double length = 4.50;
	double width = 1.80;
	double coefficient_2 = length*width/4.0 ;
	
	price_ticket = price*coefficient_2;
	
	public void pay() {
		cash += price_ticket;
	}
}
