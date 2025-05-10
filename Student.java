public class Student{

	public static void main(String arg[]){
		int english = 98;
		int maths = 99;
		int physics = 88;
		int chemistry = 77;
		int socialScience = 86;
		int language = 99;
		if (english >= 40){
			System.out.println("English pass=" + english + "/100");
		}
		else{
			System.out.println("English fail");
		}
		if (maths >= 40){
			System.out.println("Maths pass="+ maths + "/100");
		}
		else{
			System.out.println("Maths fail");
		}
		if (physics >= 40){
			System.out.println("Physics pass="+ physics + "/100");
		}
		else{
			System.out.println("Physics fail");
		}
		if (chemistry >= 40){
			System.out.println("Chemistry pass="+ chemistry + "/100");
		}
		else{
			System.out.println("Chemistry fail");
		}
		if (socialScience >= 40){
			System.out.println("Social Science pass="+ socialScience + "/100");
		}
		else{
			System.out.println("Social Science fail");
		}
		if (language >= 40){
			System.out.println("Language pass="+ language + "/100");
		}
		else{
			System.out.println("Language fail");
		}
		int totalMarks = english + maths + physics + chemistry + socialScience + language;
		double percentage = totalMarks / 600d;
		double totalPercentage = percentage *100d;
		System.out.println("Total Marks=" + totalMarks + "/600");
		System.out.println("Percentage =" + totalPercentage + "%");
	}
}