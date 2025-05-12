public class Football{
	
	public static void main(String args[]) {
		
		int realMadrid = 4;
		int barcelona = 0;
		boolean result = true;
		String stadium = "Santigo Bernabau";

		if(!result){
			System.out.println("one team win");
		}
		else{
			System.out.println("Draw Match");

		}
		if ( realMadrid >0 || barcelona >0 ){
			System.out.println("Real Madrid Win");
		}
		else{
			System.out.println("Barcelona Win");
		}
		if ( realMadrid == 0 && barcelona == 0 ){
			System.out.println(" low scoring Draw");

		}
		else {
			System.out.println(" High scoring Draw");
		}
	}
}