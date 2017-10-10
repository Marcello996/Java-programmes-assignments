package parking_plaza;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Parking {
	public double cash;
	public int num_level;
	public Level[] level;
	
	public Parking(int a) {
		cash = 0.0;
		num_level = a;
	
		level = new Level[num_level];
		for(int i=0; i<num_level; i++) {
			level[i] = new Level(30, 10, 5);
		}
	}
	
	public void in_parking(String a, String b) {
		String formatted;
		int i=0;
		int j=0;
		int flag=0;
		char[] alph = {'A', 'B', 'C'};
		Sedan sedan = new Sedan();
		Suv suv = new Suv();
		Cycle cycle = new Cycle();
		Motorbike moto = new Motorbike();
		Camper camper = new Camper();
		Urban urban = new Urban();
		
		if(a.equals("Car")) {
			for(j=0; j<num_level && flag==0; j++) {
				if(level[j].num_spot_available_car > 0) {
					i = 0;
					flag=1;
					while(level[j].num_spot_total_car[i] != null) {
						i++;
					}
					formatted = String.format("%03d", i);
					level[j].num_spot_available_car--;
					if(b.equals("Sedan")) {
						sedan.ticket = alph[j] + formatted + "A";
						formatted = alph[j] + formatted + "A";
						this.cash = sedan.pay();
						level[j].num_spot_total_car[i] = sedan;
						flag=2;
					}
					else if(b.equals("Suv")) {
						suv.ticket = alph[j] + formatted + "A";
						formatted = alph[j] + formatted + "A";
						this.cash = suv.pay();
						level[j].num_spot_total_car[i] = suv;
						flag=2;
					}
					if(flag==2) {
						System.out.println("A car is entering the spot " + formatted );
					}
					else {
						System.out.println("The vehicle cannot enter!");
					}
				}
			}
		}

		else if(a.equals("Bike")) {
			for(j=0; j<num_level  && flag==0; j++) {
				if(level[j].num_spot_available_bike > 0) {
					i = 0;
					flag=1;
					while(level[j].num_spot_total_bike[i] != null) {
						i++;
					}
					formatted = String.format("%03d", i);
					level[j].num_spot_available_bike--;
					if(b.equals("Cycle")) {
						cycle.ticket = alph[j] + formatted + "B";
						formatted = alph[j] + formatted + "B";
						this.cash = cycle.pay();
						level[j].num_spot_total_bike[i] = cycle;
						flag=2;
					}
					else if(b.equals("Motorbike")) {
						moto.ticket = alph[j] + formatted + "B";
						formatted = alph[j] + formatted + "B";
						this.cash = moto.pay();
						level[j].num_spot_total_bike[i] = moto;
						flag=2;
					}
					if(flag==2) {
						System.out.println("A bike is entering the spot " + formatted );
					}
					else {
						System.out.println("The vehicle cannot enter!");
					}
				}
			}
		}
		else if(a.equals("Bus")) {
			for(j=0; j<num_level && flag==0; j++) {
				if(level[j].num_spot_available_bus > 0) {
					i = 0;
					flag=1;
					while(level[j].num_spot_total_bus[i] != null) {
						i++;
					}
					formatted = String.format("%03d", i);
					level[j].num_spot_available_bus--;
					if(b.equals("Camper")) {
						camper.ticket = alph[j] + formatted + "C";
						formatted = alph[j] + formatted + "C";
						this.cash = camper.pay();
						level[j].num_spot_total_bus[i] = camper;
						flag=2;
					}
					else if(b.equals("Urban")) {
						urban.ticket = alph[j] + formatted + "C";
						formatted = alph[j] + formatted + "C";
						this.cash = urban.pay();
						level[j].num_spot_total_bus[i] = urban;
						flag=2;
					}
					if(flag==2) {
						System.out.println("A bus is entering the spot " + formatted );
					}
					else {
						System.out.println("The vehicle cannot enter!");
					}
				}
			}
		}
		else {
			System.out.println("The vehicle cannot enter!");
		}
	}
	
	public void out_parking(String a, String b, String c) {
		int number=0;
		int flag=0;
		int i=0;
		int[] dec = {100, 10, 1};
		char[] alph = {'A', 'B', 'C'};
		
		for(i = 1; i<4; i++) {
			number += (int)(c.charAt(i)-'0')*(dec[i-1]);		
		}
		i=0;
		while(flag==0 && i<num_level) {
			if(c.charAt(0)==alph[i]) {
				if(c.charAt(4)=='A' && level[i].num_spot_total_car[number].ticket.equals(c)) {
					level[i].num_spot_total_car[number] = null;
					level[i].num_spot_available_car++;
					flag=1;
					System.out.println("A car is leaving the spot " + c );
				}
				if(c.charAt(4)=='B' && level[i].num_spot_total_bike[number].ticket.equals(c)) {
					level[i].num_spot_total_bike[number] = null;
					level[i].num_spot_available_bike++;
					flag=1;
					System.out.println("A bike is leaving the spot " + c );
				}
				if(c.charAt(4)=='C'&& level[i].num_spot_total_bus[number].ticket.equals(c)) {
					level[i].num_spot_total_bus[number] = null;
					level[i].num_spot_available_bus++;
					flag=1;
					System.out.println("A bus is leaving the spot " + c );
				}

			}
			i++;
		}
		if(flag==0) {
			System.out.println("The vehicle cannot be removed!");
		}
		
	}
	
	
	
	
	public static void main(String[] args) throws IOException{
		String type_vehicle = "";
		String model = "";
		String enter_leave = "";
		String ticket = "";
		int i;
		Parking p = new Parking(3);
		

		FileReader fr = new FileReader("Parking_report.txt");
		BufferedReader br = new BufferedReader(fr);
		String line = null;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
			String[] items = line.split(", ");
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
			}
			if(enter_leave.equals("E")) {
				p.in_parking(type_vehicle, model);
			}
			else if(enter_leave.equals("L")) {
				p.out_parking(type_vehicle, model, ticket);
			}
		}
		br.close();
	}
}
