public class BusStationRunner{
	
	public static void main(String[] args) {
		
		BusStation.to = "Salem";
		BusStation.ticket_price= 260;
		BusStation.isTicketAvaliable= true;
		BusStation.value[]={55,44,52,45,36};


		System.out.println("Bus Name :" +BusStation.busName);
		System.out.println("Bus Stand Name :" +BusStation.busStand);
		System.out.println("From  :" +BusStation.from);
		System.out.println("To  :" +BusStation.to);
		System.out.println("Ticket Price :" +BusStation.ticket_price);
		System.out.println("Is Ticket Available :" + BusStation.isTicketAvaliable);

		System.out.println();

		for(int i=0;i<BusStation.value.length;i++){

			System.out.println("Stop Names:"+ BusStation.value[i]);
		}
	}
}