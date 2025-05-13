public class Storage{
	
	public static void main(String[] args) {
		
		int[] value = {22,55,48,69};
		int x=0;

		for(int i=0; i< value.length; i++){

			x = x + value[i];
		}

		System.out.println("Total Number of Element ="+ x);
	}
}