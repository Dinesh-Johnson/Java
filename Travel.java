public class Travel{
	
	public static void main(String[] args) {
		
		boolean managerApproval = true;
		boolean passport = true;
		boolean temporaryPass= true;
		if (managerApproval && (passport || temporaryPass)){
			System.out.println("Travel is Approved");
		}
		else{
			System.out.println("Travel is not Approved");
		}
	}
}