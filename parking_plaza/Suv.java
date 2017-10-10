package parking_plaza;

public class Suv extends Car {
	double length = 4.8;
	double width = 2.5;
	double coefficient_2 = length*width/4.0 ;
	
	price_ticket = price*coefficient_2;
	
	public void pay() {
		cash += price_ticket;
	}

}
