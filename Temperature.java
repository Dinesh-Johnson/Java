public class Temperature{

	public static void main(String arg[]){

		int temp = 31;
		if(temp < 0){
			System.out.println("Freezing");
		}
		else if (temp < 15){
			System.out.println("Cold");
		}
		else if (temp > 30){
			System.out.println("Hot");
		}
		else{
			System.out.println("Normal Temperature");
		}
	}
}