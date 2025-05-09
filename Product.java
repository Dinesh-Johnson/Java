public class Product{

	public static void main(String arg[]){

		String powder = "Detergent";
		String perfume = "Fog";
		String beverage = "Red Bull";
		String repeller = "Hit";
		String soap = "Personna";

		if (powder == "Detergent"){

			System.out.println("Detergent check");
		}
		else {
			System.out.println("Not Detergent");
		}
		if (perfume == "Fog"){
			System.out.println("Fog Check");
		}
		else {
			System.out.println("Not Perfume");
		}
		if (beverage == "Red Bull"){
			System.out.println("Red Bull Check");
		}
		else {
			System.out.println("Not Beverage");
		}
		if (repeller == "Hit"){
			System.out.println("Hit Check");
		}
		else {
			System.out.println("Not Repeller");
		}
		if (soap == "Personna"){
			System.out.println("Personna Check");
		}
		else {
			System.out.println("Not Soap");
		}

		int detergent = 1000;
		int redBull = 500;
		int fog = 1200;
		int hit = 300;

		if(detergent == 1000){
			System.out.println("Equal to 1000");
		}
		else{
			System.out.println("Not equal to 1000");
		}
		if(redBull <=500){
			System.out.println("It is less than or Equal to 500");
		}
		else{
			System.out.println("It is not less than or Equal to 500");
		}
		if (fog >= 1000){
			System.out.println("Fog is Greater than or Equal to 1000");
		}
		else{
			System.out.println("Fog is not Greater than or equal to 1000");
		}
		if (hit < 600){
			System.out.println("less than 600");
		}
		else{
			System.out.println("Not less than 600");
		}
		if (redBull > 500){
			System.out.println("It is Greater than 800");
		}
		else {
			System.out.println("It is Not Greater than 800");
		}
		if (detergent != 700){
			System.out.println("Not equals to 700");
		}
		else {
			System.out.println("equals to 700");
		}
	}

}