public class Default{
	
	static int[] name = {22,55,77,66,25};

	public static void main(String[] args) {

		for(int i=0; i<name.length;i++){

			System.out.print(name[i]+"  ");
		}
		
		int swap = name[0];
		name[0]=name[name.length-1];
		name[name.length-1] = swap;
		System.out.println();

		for(int i=0; i<name.length;i++){

			System.out.print(name[i]+"  ");
		}
	}
}