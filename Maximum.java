public class Maximum{
	
	public static void main(String[] args) {
		
		int value[] ={52,18,36,14,35,48};

		int max =0;

		for(int i=0; i<value.length;i++){
			if(max< value[i]){
			max =value[i];
			}
		}
		System.out.println("The Maximum Number is --"+ max);
	}
}