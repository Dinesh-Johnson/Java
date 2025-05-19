public class RelativesRunner{

	public static void main(String[] args) {
			
			String realtiveName = Relatives.name();
			System.out.println("The Name Of The Realtive is "+realtiveName);

			byte realtiveNumber =Relatives.numbers();
			System.out.println("There are "+realtiveNumber+realtiveName+"s in the Family ");

			int sumOfAge= Relatives.ageCombined();
			System.out.println("The Sum of the Combined Age is "+sumOfAge);
		}	
}