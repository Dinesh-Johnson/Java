public class SumArray{

	public static void main(String[] args) {
		
		int value[] = {15,11,11,2,18,14};
		int x=0;

		for(int i=0; i< value.length; i++){
			x=x+value[i];
		}
		if(x==50){
			System.out.println("The Sum of Array is Equal to 50");
		}
		else{
			System.out.println("The Sum of Array is not Equal to 50");
		}
	}
}