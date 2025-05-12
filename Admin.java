public class Admin{

	public static void main(String[] args) {
		boolean password = false;
		String user = "Admin";
		if (!password || user == "admin"){
			System.out.println("You have Logged In");
		}
		else {
			System.out.println("You are not the admin or your password is invalid");
		}
	}
}