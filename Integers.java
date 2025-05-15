public class Integers{
	
	public static void main(String[] args) {
		
		int[] value={-3,-2,-1,0,1,2,3};
		
		for(int i=0; i<value.length; i++){
			if(value[i]<value[6]){

				System.out.println(value[i+1]);
			}
			else{
				System.out.println(value[3]);
			}
		}
	}
}