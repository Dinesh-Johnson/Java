public class Target{

	public static void main(String[] args) {
		
		int[] value = {1,2,4,6,7,2,7,8,3,23};

		for(int y=0; y < value.length; y++){
			if(value[y] == 7){
				System.out.println("Target number found in the"+ "   " + y +"th "+ "array");
			}
		}
	}
}