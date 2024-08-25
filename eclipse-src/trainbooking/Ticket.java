package trainbooking;

public class Ticket {
	static int countu=21;
	static int countm=21;
	static int countl=21;
	static int countrac=18;
	static int countwl=10;
	
	void book() {
		if(countl!=0 ||countm!=0 || countu!=0) {
			Passenger p = new Passenger();
			
		}
		else if(countrac!=0) {
			Passenger p=new Passenger();
			
			
		}
		else if(countwl!=0) {
			
		}
		else {
			System.out.println("No tickets available");
		}
	}
}
