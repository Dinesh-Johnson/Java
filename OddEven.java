public class OddEven{
	
	public static void main(String[] args) {
		
		int[] numbers ={25,63,44,53,46};
		int oddNumbers = 0;
		int evenNumbers = 0;

		for(int index = 0; index < numbers.length; index++){
			if(numbers[index] % 2 == 0){
				evenNumbers = evenNumbers + numbers[index];
			}
			else{
				oddNumbers = oddNumbers + numbers[index];
			}
		}
		System.out.println("The sum of Even Numbers are=" + evenNumbers);
		System.out.println("The sum of odd Numbers are=" + oddNumbers);
	}
}