public class NestedFor{
	
	public static void main(String[] args){

		for(int i=1; i<3; i++){
			System.out.println(" "+ i);

			for(int j=i; j<4; j++){
				System.out.print(" "+ j);
			}
		}		
	}
}