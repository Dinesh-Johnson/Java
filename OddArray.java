public class OddArray{

	static int numbers[] ={62,55,17,36,74,11,35,21,4};
	
	public static void main(String[] args) {

		int oddNumber =0;
		int evenNumber=0;

		for(int i=0; i<numbers.length; i++){

			if(numbers[i]%2 == 0){
				evenNumber++;
			}
			else{
				oddNumber++;		
			}
		}
		System.out.println(evenNumber +"  Numbers are Even Numbers ");
		System.out.println(oddNumber +"  numbers are Odd Numbers ");
	}
}