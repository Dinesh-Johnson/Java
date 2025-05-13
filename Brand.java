public class Brand{

	public static void main(String[] args) {
		
		String[] brandName = {"Crocs", "Adidas", "Nike"};

		for(int index = 0; index < brandName.length; index++){
			if(brandName[index] == "Crocs"){
				System.out.println(index + ":" + brandName[index]);
			}
		}
	}
}