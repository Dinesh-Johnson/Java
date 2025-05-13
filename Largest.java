public class Largest{
	
	public static void main(String[] args) {
		
		int[] value = {336,54,469,54,1,145};
		int y =value[0];

		for(int i=1; i < value.length; i++){
			if(value[i] > y){
				y = value[i];
			}

		}
		System.out.println("The largest Number is =" + y);
	}
}