package busticket;


	import java.util.ArrayList;
	import java.util.Scanner;

	public class Bus_details_main {
		static ArrayList<Bus_details>bus=new ArrayList<>();
		static ArrayList<Booking>booking=new ArrayList<>();
		
		public static void main(String[]args) {
			
			loop();
			

		}
			public static void loop() { 
				bus.add(new Bus_details(1,"AC",1,"arikaran"));
				bus.add(new Bus_details(2,"NON AC",3,"vishal"));
				bus.add(new Bus_details(3,"AC",3,"rajesh"));
				
			int userinput=1;
			Scanner sc=new Scanner(System.in);
			while(userinput==1){
				System.out.println("entet 1 to book ticket\t 2 to view your ticket \t 3 to cancel ticket \t exit");
			int userinput2=sc.nextInt();
	
			if(userinput2==1) {
				for(Bus_details b:bus) {
					b.display_businfo();
					
		}
				
				Booking obj=new Booking();
				if(obj.isAvailable(bus,booking)) {
					booking.add(obj);
					System.out.println("booking is successfully added");
				}
				else
					System.out.println("try another bus or date");
			}
			else if(userinput2==2) {
				System.out.println("enter your id:");
				int newid=sc.nextInt();
				if(booking.size()==0)
					System.out.println("enter valid id");
		      for(Booking b:booking) {
					if(b.id==newid) {
						Booking.view();
					}
					else
						System.out.println("enter vaild id");
			}
			
			}
			else if(userinput2==3) {
				System.out.println("enter your id:");
				int newid=sc.nextInt();
				if(booking.size()==0)
					System.out.println("enter valid id");
				for(Booking b:booking) {
				if(b.id==newid) {
					
					booking.remove(b);
					System.out.println("remove");
					break;
				}
				else
					System.out.println("enter vaild id");
					
					}
				
			}
			else
				System.out.println("sorry try next");}
			
		}
		
		

	}

