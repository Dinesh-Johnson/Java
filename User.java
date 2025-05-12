public class User{

	public static void main(String[] args) {
		
		int age =22;
		boolean hasID = false;
		boolean hasInvitation = true;
		if(age >= 18 && hasID || hasInvitation){
			System.out.println("Access Allowed");
		}
		else{
			System.out.println("Access Denied");
		}
	}
}