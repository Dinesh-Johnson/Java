public class SportRunner{
	
	public static void main(String[] args) {
		
		String team = Sport.cricket();
		System.out.println("The IPL team is " +team);

		short iplWins= Sport.iplWin();
		System.out.println(iplWins+ " times IPL Champions");

		byte clWins = Sport.clWin();
		System.out.println(clWins+" times Champion league Champions");
	}
}