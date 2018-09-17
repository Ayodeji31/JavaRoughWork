package Automobile;

public class InterfaceDemo1 {

	public static void main(String[] args) {
		CarsInterface myinterface = new InterfaceDemo();
		
		myinterface.enginestart("8cy", true);
		myinterface.enginestart(null, false);

	}

}
