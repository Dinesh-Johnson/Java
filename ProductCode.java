public class ProductCode{
	
	public static void main(String[] args) {
		
		int[] product_code = {25,545,23,22,26,289,247,236};
		int even_code =0;
		int odd_code = 0;

		for(int index = product_code.length-1; index >= 0; index--){
			if(product_code[index] %2 == 0){

				System.out.println("The even code is :"+ product_code[index]);
			}
			else{
				System.out.println("The Odd Code is :" +product_code[index]);
			}

		}


	}
}