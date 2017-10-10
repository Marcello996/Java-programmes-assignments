package parking_plaza;

public class Suv extends Car {
	double length = 4.8;
	double width = 2.5;
	double coefficient_2 = (length*width)/(double)4.0 ;
	
	public double pay() {
		price_ticket = coefficient*coefficient_2;
		cash += price_ticket;
		return cash;
	}

}
