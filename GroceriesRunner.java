public class GroceriesRunner{

	public static void main(String[] args) {

		String veg = Groceries.vegetable();
		System.out.println("Groceries item is  "+ veg);

		byte cost = Groceries.price();
		System.out.println("The Cose of the Item  "+cost);

		double discountPrice = Groceries.discount();
		System.out.println("The Discount is "+discountPrice);
	}

}