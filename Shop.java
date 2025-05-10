public class Shop{

	public static void main (String arg[]){

		int price = 10000;
		if (price == 2000){
			double discount = price * 0.2d;
			double discountPrice = price - discount;
			double gstPrice = price * 0.18d;
			double finalPrice =  gstPrice + discountPrice;
			System.out.println("Final Price" + finalPrice);
		}
		else if (price == 10000){
			double discount = price * 0.35d;
			double discountPrice = price - discount;
			double gstPrice = price * 0.18d;
			double finalPrice =  gstPrice + discountPrice;
			System.out.println("Final Price" + finalPrice);
		} 
		else if (price > 10000){
			double discount = price * 0.5d;
			double discountPrice = price - discount;
			double gstPrice = price * 0.18d;
			double finalPrice =  gstPrice + discountPrice;
			System.out.println("Final Price" + finalPrice);
		}
	}
}