package parking_plaza;

public class Urban extends Bus{
	double length = 12.0;
	double width = 3.5;
	double coefficient_2 = (length*width)/(double)8.0 ;
	
	public double pay() {
		price_ticket = coefficient*coefficient_2;
		cash += price_ticket;
		return cash;
	}
}
