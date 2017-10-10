package parking_plaza;

import java.util.ArrayList;

public class Level extends Parking {
	int num_spot_available_car = 0;
	Car[] num_spot_total_car;
	int num_spot_available_bike = 0;
	Bike[] num_spot_total_bike;
	int num_spot_available_bus = 0;
	Bus[] num_spot_total_bus;
	
	Level(int a, int b, int c) {
		int num_spot_available_car = a;
		Car[] num_spot_total_car = new Car[a];
		int num_spot_available_bike = b;
		Bike[] num_spot_total_bike = new Bike[b];
		int num_spot_available_bus = c;
		Bus[] num_spot_total_bus = new Bus[c];
	}
	
}
