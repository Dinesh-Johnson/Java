public class Marks{
	
	static int[] marks = {55,49,60,85,99};

	public static void main(String[] args) {

		String subject[]={"English","Language","Social Science","Physics", "Maths"};
		
		for(int i=0; i<subject.length; i++){

			System.out.println(subject[i]+" - "+marks[i]);

		}

	}
}