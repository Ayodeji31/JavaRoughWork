package roughWork;
import java.util.Scanner;
public class MyWork {

	public static void main(String[] args){
		
		Scanner user_input = new Scanner(System.in);
		
		int first_Number, Second_Number, third_Number, answer;
		
		String first_Name, last_Name;
		char initial;
//		double first_Name, last_Name, answer;
		// With float add f to the end of the number before the semicolon
//		float first_Name, last_Name, answer;
		
		
		first_Number = 10;
		Second_Number = 20;
		third_Number = 25;
		 answer = (first_Number + Second_Number) / third_Number;
		 
		 first_Name = "Ayodeji";
		 last_Name = "Joseph";
		 initial = 'A';
		 
		 System.out.println("Enter your first name:");
		 first_Name = user_input.next();
		 
		 System.out.println("Enter your last name:");
		 last_Name = user_input.next();
		 
		 String full_name;
		 full_name = first_Name + " " + last_Name;
		 System.out.println("You are " +full_name);
		 
		 
		 System.out.println(first_Name  + " " + last_Name + " and my initial starts with " + initial);
		
		System.out.println("Total =" + answer );
		
		if(first_Number!=10){
			
			System.out.println("My name is JOE Boy");
		}
		
        if(first_Number!=10){
	
			System.out.println("My name is JOE");
			
		}else{ System.out.println("Don't be a bad Guy");
		
		
		}
        
       
	}
	
	
}
