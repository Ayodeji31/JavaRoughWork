package roughWork;

import java.util.ArrayList;

public class Sub_string {
	
	public static void main(String[] args){
		
		String FullName = "Bill Gates";
		String FirstNameChars = "";
		ArrayList a = new ArrayList();
		long start = System.currentTimeMillis();
		FirstNameChars = FullName.substring(4,9);
		
		System.out.println(FirstNameChars);
		
		int spacePos = FullName.indexOf(" ");
		System.out.println(" Space is at position " + spacePos);
		
		
		
		for (int i =1; i<=10000;i++){
			
			a.add(i);
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println(end - start);
		
		
	}

}
