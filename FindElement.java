public class FindElement{
	
	public static void main(String[] args) {
		
		int[] array= {5,2,3,6,8,7,4,1,3,1,3};
		int count=0;

		for(int i=0; i<array.length; i++){
			for (int j=i; j<array.length;j++){
				if(array[i]==array[j]){
					count++;
				}
			}
		}
		System.out.println("Count"+ count); 
		int count2=0;
		for(int i=0; i<array.length-1; i++){
			if (array[i]==array[i+1]){
				count2++;
				System.out.println("Count 2"+count2);
			}
		}

	}
}