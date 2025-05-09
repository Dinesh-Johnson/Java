public class Bus{

	public static void main(String arg[]){
		//variables
		String busName;
		busName = "KSRTC";
		int seats;
		seats = 103;
		short passengers;
		passengers = 200;
		long travelDistance;
		travelDistance = 500;
		double ticketPrice;
		ticketPrice =  250.0d;
		float dicountForStudents;
		dicountForStudents = 0.50f;
		char onlineTicker;
		onlineTicker = 'C';
		boolean ticketBooking;
		ticketBooking = true;
		byte numberOfDriver;
		numberOfDriver = 2;
		String destinationName;
		destinationName = "Tamil Nadu";
		System.out.println("Bus Name :" + busName);
		System.out.println("No of Seats :" + seats);
		System.out.println("No of passengers:" + passengers);
		System.out.println("Distance :" + travelDistance);
		System.out.println("Ticket Price:" +ticketPrice);
		System.out.println("Student Discount:" + dicountForStudents);
		System.out.println("Ticket Online:" + onlineTicker);
		System.out.println("Ticket Booking:" + ticketBooking);
		System.out.println("Toatal Drivers:" + numberOfDriver);
		System.out.println("Destination:" + destinationName);

		int seats2 = 150;
		int total = seats+seats2;
		String sourceName ="Banglore";
		System.out.println("route"+sourceName+destinationName);
		System.out.println("Total"+total);
		int remainingSeats = seats2-seats;
		double discountPrice = ticketPrice*dicountForStudents;
		double divison = dicountForStudents/ticketPrice;
		double percentage = ticketPrice%dicountForStudents;
		System.out.println("Reamaing Seats:" + remainingSeats);
		System.out.println("Student Price:" + discountPrice);
		System.out.println("Divison" + divison);
		System.out.println("Percentage:" + percentage);
		System.out.println(--seats2);
		System.out.println(++seats);

	}


}