public class Weather{
	
	public static void main(String[] args) {
		
		int temp = 28;
		if(0 <= temp && temp < 15){
			System.out.println("Cold");
		}
		else if(15 <= temp && temp < 25){
			System.out.println("Cool");
		}
		else if(25 <= temp && temp < 35){
			System.out.println("Warm");
		}
		else{
			System.out.println("Hot");
		}
	}
}