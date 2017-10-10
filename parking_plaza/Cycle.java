package parking_plaza;

public class Cycle extends Bike {
	double length = 1.5;
	double width = 1.0;
	double coefficient_2 = (length*width)/(double)2.0 ;
	
	public double pay() {
		price_ticket = coefficient*coefficient_2;
		cash += price_ticket;
		return cash;
	}
}
