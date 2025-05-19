public class InstituteRunner{
	
	public static void main(String[] args) {
		
		String instituteName= Institute.name();
		System.out.println("The Name of The Institue is "+instituteName);

		String trainerName= Institute.trainer();
		System.out.println("The Name of The Trainer is "+trainerName);

		int duriation= Institute.trainingTime();
		System.out.println("Duriation of The Training Period is "+duriation+" Months");
	}
}