package roughWork;

public class TestMethods {
  
	public static void main(String[]args){
		
		MyMethods tap = new MyMethods();
		
		int aVal = tap.total();
		
		System.out.println( "Method result = " + aVal );
		
		tap.print_text();
		int aVal2 = tap.total(30);
		
		System.out.println("Method result = " + aVal2 );
		
		tap.print_text("The value was " , aVal2);
		
	}
	
}
