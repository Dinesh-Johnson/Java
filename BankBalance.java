public class BankBalance{

	public static void main(String arg[]){

		int bankBalance = 10000;
		double twoPercent = bankBalance*0.02d;
		double fivePercent = bankBalance*0.05d;
		int lowBalance= bankBalance-350;
		if (bankBalance < 1000){
			System.out.println("Your Balance is less thann 1000");
		}
		else if(bankBalance == 1000){

			System.out.println("Your balance is =" +twoPercent);
		}
		else if (bankBalance == 10000){

			double five = bankBalance + fivePercent;
			System.out.println("Your Balance is=" + five);
		}
		else {
			System.out.println(" Your Bank balance is charged with sms serice and the Remaining Balance are=" + lowBalance);
		}
	}
}