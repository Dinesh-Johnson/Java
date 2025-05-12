public class VIP{

	public static void main(String[] args) {
		
		boolean isVIP = true;
		boolean hasticket = false;
		if(isVIP || hasticket){
			System.out.println("Access Allowed");
		}
		else{
			System.out.println("Deny Entry");
		}
	}
}