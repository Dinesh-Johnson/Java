public class Distinct{
	
	public static void main(String[] args) {
		
		int[] value ={0,1,2,3,5};

		for(int i=0;i<value.length;i++){
			if(i!=value[i]){
				System.out.println(i);
			}

		}
	}
}