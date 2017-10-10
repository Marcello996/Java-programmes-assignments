package parking_plaza;

public class Camper extends Bus {
	double length = 7.50;
	double width = 3.5;
	double coefficient_2 = length*width/8.0 ;
	
	price_ticket = price*coefficient_2;
	
	public void pay() {
		cash += price_ticket;
	}
}
