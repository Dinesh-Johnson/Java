public class Average{
	
	public static void main(String[] args) {
		
		int[] index = {36,24,226,58,214,5};
		int y=0;

		for(int z = 0; z < index.length; z++){
			y=y+index[z];
		}
		double average = y / index.length;
		System.out.println("The Average of the given Value is =" + average);
	}
}