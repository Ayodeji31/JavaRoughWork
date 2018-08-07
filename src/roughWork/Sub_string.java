package roughWork;

public class Sub_string {
	
	public static void main(String[] args){
		
		String FullName = "Bill Gates";
		String FirstNameChars = "";
		
		
		FirstNameChars = FullName.substring(4,9);
		
		System.out.println(FirstNameChars);
		
		int spacePos = FullName.indexOf(" ");
		System.out.println(" Space is at position " + spacePos);
		
	}

}
