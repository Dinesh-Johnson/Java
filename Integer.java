public class Integer{
	
	public static void main(String[] args) {
		
		int[] value={-2,-1,0,1,2,3};
		int maxvalue =0;
		
		for(int i=0; i<value.length; i++){
			maxvalue = maxvalue + value[i];
		}
		System.out.println(maxvalue);
	}
}