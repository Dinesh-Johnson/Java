public class Citizen{

	public static void main(String[] args) {
		
		boolean citizen = true;
		int a = 28;
		if (citizen && a>=18){
			System.out.println("Your are Eligible to Vote");
		}
		else{
			System.out.println("Your are not Eligible to Vote");
		}
	}
}