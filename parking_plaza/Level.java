package parking_plaza;

public class Level{
	public int num_spot_available_car;
	public Car[] num_spot_total_car;
	public int num_spot_available_bike;
	public Bike[] num_spot_total_bike;
	public int num_spot_available_bus;
	public Bus[] num_spot_total_bus;
	
	public Level(int a, int b, int c) {
		num_spot_available_car = a;
		num_spot_total_car = new Car[a];
		num_spot_available_bike = b;
		num_spot_total_bike = new Bike[b];
		num_spot_available_bus = c;
		num_spot_total_bus = new Bus[c];
	}
	
}
