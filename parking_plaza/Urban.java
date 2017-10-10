package parking_plaza;

public class Urban extends Bus{
	double length = 12.0;
	double width = 3.5;
	double coefficient_2 = length*width/8.0 ;
	
	price_ticket = price*coefficient_2;
	
	public void pay() {
		cash += price_ticket;
	}
}
