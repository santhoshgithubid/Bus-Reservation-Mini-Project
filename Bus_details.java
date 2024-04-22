package busticket;


	import java.util.Date;

	public class Bus_details {
		
		
		private int busno;
		private String type;
		private int seat;
		private String DriverName;
		Bus_details(int busno,String type,int seat,String DriverName){
		
			this.busno=busno;
			this.type=type;
			this.seat=seat;
			this.DriverName=DriverName;
			
		}

		public int getseat() {
			return seat;
		}
		public void setseat() {
			seat=seat;
		}
		public int getbusno() {
			return busno;
		}
		public void setbusno() {
			busno=busno;
		}
		public String gettype() {
			return type;
		}
		public void settype() {
			type=type;
		}
		public String getDriverName() {
			return DriverName ;
		}
		public void setDriverName() {
			DriverName=DriverName;
		}
		
		public void display_businfo(){
			System.out.println("Busno:"+"   "+busno+" type:"+"   "+type+" seat:"+"   "+seat+"    "+"DriverName:"+"   "+DriverName);
		}
		
		
	}

