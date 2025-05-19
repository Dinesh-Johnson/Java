public class SeriesRunner{

	static int[] arrays ={8,4,2,6};
	
	public static void main(String[] args) {
		
		Series.doubles=55.32;
		Series.charc='B';
		Series.booleans=true;
		Series.strings=null;

		System.out.println("The byte value is ="+ Series.bytes);
		System.out.println("The Short Value is =" +Series.shorts);
		System.out.println("The Integer Value is =" +Series.integer);
		System.out.println("The Long Value is =" +Series.longs);
		System.out.println("The Float Float is =" +Series.floats);
		System.out.println("The Double Value is =" +Series.doubles);
		System.out.println("The Char Value is =" +Series.charc);
		System.out.println("The Boolean Value is =" +Series.booleans);

		if(Series.strings != null){
			System.out.println("String Value ="+Series.strings);
		}
		else{
			System.out.println("The String Value is NUll");
		}

		System.out.println();

			for(int i=0;i<arrays.length;i++){

			System.out.println("The Array Value is--"+ arrays[i]);
		}

	}
	
}