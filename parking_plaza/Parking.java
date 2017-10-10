package parking_plaza;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Parking {
	public double cash, basic_price;
	private int num_level;
	private Level level_1, level_2, level_3;
	
	public Parking() {
		cash = 0.0;
		basic_price = 1.0;
		num_level = 3;
	
		level_1 = new Level(300, 100, 50);
		level_2 = new Level(300, 100, 50);
		level_3 = new Level(200, 200, 0);
	}
	
	public void in_parking(String a, String b) {
		String formatted;
		int i=0;
		Sedan sedan = new Sedan();
		Suv suv = new Suv();
		Cycle cycle = new Cycle();
		Motorbike moto = new Motorbike();
		Camper camper = new Camper();
		Urban urban = new Urban();
		
		if(a=="Car") {
			
			if(level_1.num_spot_available_car > 0) {
				i = 0;
				while(level_1.num_spot_total_car != null) {
					i++;
				}
				formatted = String.format("%03d", i);
				level_1.num_spot_available_car--;
				if(b=="Sedan") {
					sedan.ticket = "A" + formatted + "A";
					sedan.pay();
					level_1.num_spot_total_car[i] = sedan;
				}
				if(b=="Suv") {
					suv.ticket = "A" + formatted + "A";
					suv.pay();
					level_1.num_spot_total_car[i] = suv;
				}
			} else if(level_2.num_spot_available_car > 0) {
				i = 0;
				while(level_2.num_spot_total_car != null) {
					i++;
				}
				formatted = String.format("%03d", i);
				level_2.num_spot_available_car--;
				if(b=="Sedan") {
					sedan.ticket = "A" + formatted + "A";
					sedan.pay();
					level_1.num_spot_total_car[i] = sedan;
				}
				if(b=="Suv") {
					suv.ticket = "A" + formatted + "A";
					suv.pay();
					level_1.num_spot_total_car[i] = suv;
				}
			} else if(level_3.num_spot_available_car > 0) {
				i = 0;
				while(level_3.num_spot_total_car != null) {
					i++;
				}
				formatted = String.format("%03d", i);
				level_3.num_spot_available_car--;
				if(b=="Sedan") {
					sedan.ticket = "A" + formatted + "A";
					sedan.pay();
					level_1.num_spot_total_car[i] = sedan;
				}
				if(b=="Suv") {
					suv.ticket = "A" + formatted + "A";
					suv.pay();
					level_1.num_spot_total_car[i] = suv;
				}
			}
			
		}
		
		if(a=="Bike") {

			if(level_1.num_spot_available_bike > 0) {
				i = 0;
				while(level_1.num_spot_total_bike != null) {
					i++;
				}
				formatted = String.format("%03d", i);
				level_1.num_spot_available_bike--;
				if(b=="Cycle") {
					cycle.ticket = "A" + formatted + "B";
					cycle.pay();
					level_1.num_spot_total_bike[i] = cycle;
				}
				if(b=="Motorobike") {
					moto.ticket = "A" + formatted + "B";
					moto.pay();
					level_1.num_spot_total_bike[i] = moto;
				}
			} else if(level_2.num_spot_available_bike > 0) {
				i = 0;
				while(level_2.num_spot_total_bike != null) {
					i++;
				}
				formatted = String.format("%03d", i);
				level_2.num_spot_available_bike--;
				if(b=="Cycle") {
					cycle.ticket = "A" + formatted + "B";
					cycle.pay();
					level_1.num_spot_total_bike[i] = cycle;
				}
				if(b=="Motorbike") {
					moto.ticket = "A" + formatted + "B";
					moto.pay();
					level_1.num_spot_total_bike[i] = moto;
				}
			} else if(level_3.num_spot_available_bike > 0) {
				i = 0;
				while(level_3.num_spot_total_bike != null) {
					i++;
				}
				formatted = String.format("%03d", i);
				level_3.num_spot_available_bike--;
				if(b=="Cycle") {
					cycle.ticket = "A" + formatted + "B";
					cycle.pay();
					level_1.num_spot_total_bike[i] = cycle;
				}
				if(b=="Motorbike") {
					moto.ticket = "A" + formatted + "B";
					moto.pay();
					level_1.num_spot_total_bike[i] = moto;
				}
			}
			
			
		}
		if(a=="Bus") {
			if(level_1.num_spot_available_bus > 0) {
				i = 0;
				while(level_1.num_spot_total_bus != null) {
					i++;
				}
				formatted = String.format("%03d", i);
				level_1.num_spot_available_bus--;
				if(b=="Camper") {
					camper.ticket = "A" + formatted + "C";
					camper.pay();
					level_1.num_spot_total_bus[i] = camper;
				}
				if(b=="Urban") {
					urban.ticket = "A" + formatted + "C";
					urban.pay();
					level_1.num_spot_total_bus[i] = urban;
				}
			} else if(level_2.num_spot_available_bus > 0) {
				i = 0;
				while(level_2.num_spot_total_bus != null) {
					i++;
				}
				formatted = String.format("%03d", i);
				level_2.num_spot_available_bus--;
				if(b=="Camper") {
					camper.ticket = "A" + formatted + "C";
					camper.pay();
					level_1.num_spot_total_bus[i] = camper;
				}
				if(b=="Urban") {
					urban.ticket = "A" + formatted + "C";
					urban.pay();
					level_1.num_spot_total_bus[i] = urban;
				}
			} else if(level_3.num_spot_available_bus > 0) {
				i = 0;
				while(level_3.num_spot_total_bus != null) {
					i++;
				}
				formatted = String.format("%03d", i);
				level_3.num_spot_available_bus--;
				if(b=="Camper") {
					camper.ticket = "A" + formatted + "C";
					camper.pay();
					level_1.num_spot_total_bus[i] = camper;
				}
				if(b=="Urban") {
					urban.ticket = "A" + formatted + "C";
					urban.pay();
					level_1.num_spot_total_bus[i] = urban;
				}
			}
			
		}
	}
	
	public void out_parking(String a, String b, String c) {
		int number;
		String num = null;
		
		for(int i = 1; i<4; i++) {
			num = num + c.charAt(i);
		}
		
		number = Integer.parseInt(num);
		if(c.charAt(0)=='A') {
			if(c.charAt(4)=='A') {
				level_1.num_spot_total_car[number] = null;
				level_1.num_spot_available_car++;
			}
			if(c.charAt(4)=='B') {
				level_1.num_spot_total_bike[number] = null;
				level_1.num_spot_available_bike++;
			}
			if(c.charAt(4)=='C') {
				level_1.num_spot_total_bus[number] = null;
				level_1.num_spot_available_bus++;
			}
			
		}
		if(c.charAt(0)=='B') {
			if(c.charAt(4)=='A') {
				level_2.num_spot_total_car[number] = null;
				level_2.num_spot_available_car++;
			}
			if(c.charAt(4)=='B') {
				level_2.num_spot_total_bike[number] = null;
				level_2.num_spot_available_bike++;
			}
			if(c.charAt(4)=='C') {
				level_2.num_spot_total_bus[number] = null;
				level_2.num_spot_available_bus++;
			}
			
		}
		if(c.charAt(0)=='C') {
			if(c.charAt(4)=='A') {
				level_3.num_spot_total_car[number] = null;
				level_3.num_spot_available_car++;
			}
			if(c.charAt(4)=='B') {
				level_3.num_spot_total_bike[number] = null;
				level_3.num_spot_available_bike++;
			}
			if(c.charAt(4)=='C') {
				level_3.num_spot_total_bus[number] = null;
				level_3.num_spot_available_bus++;
			}
			
		}
		
	}
	
	
	
	
	public static void main(String[] args) throws IOException{
		String type_vehicle = null;
		String model = null;
		String enter_leave = null;
		String ticket = null;
		int i;
		Parking p = new Parking();
		
		FileReader fr = new FileReader("Parking_report.txt");
		BufferedReader br = new BufferedReader(fr);
		String line = null;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
			String[] items = line.split(",");
			i = 0;
			for (String item : items) {
				if(i==0) {
					type_vehicle = item;
				}
				if(i==1) {
					model = item;
				}
				if(i==2) {
					enter_leave = item;
				}
				if(i==3) {
					ticket = item;
				}
				i++;
				System.out.println("item = " + item);
			}
			if(enter_leave=="E") {
				p.in_parking(type_vehicle, model);
			}
			if(enter_leave=="L") {
				p.out_parking(type_vehicle, model, ticket);
			}
		}
		br.close();
		
	}
}
