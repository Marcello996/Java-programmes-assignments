package parking_plaza;

public class Sedan extends Car {
	double length = 4.50;
	double width = 1.80;
	double coefficient_2 = (length*width)/(double)4.0;
	
	public double pay() {
		price_ticket = coefficient*coefficient_2;
		cash += price_ticket;
		return cash;
	}
}
