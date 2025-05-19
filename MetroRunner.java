public class MetroRunner{
	
	public static void main(String[] args) {
		
		String metroName=Metro.name();
		System.out.println("The Name of the Metro is "+metroName);

		byte laneNumbers=Metro.lanes();
		System.out.println("There are "+laneNumbers+" of lanes currently constructed");

		int trainPerLane=Metro.perlaneTrain();
		System.out.println("There are "+trainPerLane+" Of trains running per lane");
	}
}