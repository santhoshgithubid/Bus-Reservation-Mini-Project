package busticket;


	import java.text.*;
	import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
	import java.util.Scanner;

	public class Booking {
		Scanner sc=new Scanner(System.in);
		static int b_num=1000;
	 static  String pasangername;
	 static int busno;
	 static Date date;
	 static ArrayList<String>li=new ArrayList<>(Arrays.asList("tenkasi","madurai","vilupuram","chennai"));
	
	
	int id;
	     Booking(){
	    	 Scanner sc=new Scanner(System.in);
	    	 System.out.println("enter the busno");
	    	 busno=sc.nextInt() ;
	    	 
	    	 System.out.println("enter the name");
	    	 pasangername=sc.next();
	    	 
	    	 System.out.println("enter the date dd-mm-yyyy");
	    	 String dateinput=sc.next();
	    	 
	    	 SimpleDateFormat dateformat=new SimpleDateFormat("dd-MM-yyyy");
	    	 
	    	 try {
				date=dateformat.parse(dateinput);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	 System.out.println();
	    	 
	    	 
	     }
	     public static void view() {
	    	 System.out.println("name:"+pasangername+"\ndate:"+date+"\nbusno:"+busno+"from:"+"    "+from +"To:"+"    "+to+"/n duration:"+"    "+duration);
	     }
	     
	     
	     
	     
	     
	     
	   public boolean  isAvailable(ArrayList<Bus_details>bus,ArrayList<Booking>booking){
	    	 
		   int capacity=0;
		   for(Bus_details b:bus) {
			   if(b.getbusno()==busno) {
				   capacity=b.getseat();
			   }
		   }
		   int booked=0;
		   for(Booking b:booking) {
			   if(b.busno==busno && b.date.equals(date)) {
				   booked++;
			   }
		   }
		   int avlseat=capacity-booked;
		   System.out.println("availableseat:"+avlseat);
		   if(booked<capacity) {
			   
			   
			  
			   if(from()) {
				   id=b_num++;
				   System.out.println("your id:"+id);
			   return true;
			   }
		   }
		   
			  
		return false;
		 
	     }
	   static int duration=0;
	   static String from="";
	   static String to="";
	   public  boolean from() {
		   for(String s:li) {
			   System.out.println(s);
		   }
		   System.out.println("enter the from:");
		    from=sc.next();
		   System.out.println("enter the to:");
		    to=sc.next();
			   duration=  (li.indexOf(to)-li.indexOf(from))*4;
			   if(li.contains(from)&&li.contains(to)) {
				   
				   return true;
				   
			   }
		   
		   
	  return false; 
	  }
	   
	   
	}



