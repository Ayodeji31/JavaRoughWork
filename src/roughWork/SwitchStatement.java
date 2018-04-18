package roughWork;

import java.util.Scanner;

public class SwitchStatement {
	
	public static void main(String[] args){
		
		int user = 17;
		
		Scanner user_input = new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age = user_input.nextInt();
		System.out.println("Choose a colour: Black, White, Red, Blue ");
		String colour = user_input.next();
		
		
		switch (user){
		
		case 18 :
			System.out.println("You're 18");
			break;
			
		case 19:
			System.out.println("You're 19");
			break;
			
		case 21: 
			System.out.println("You're 21");
			break;
			
		default:
			System.out.println("You're not 18, 19 0r 21");
			
		}	
			
			switch ( age ) {

			case 0: case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9: case 10:

			System.out.println( age + " is between 0 and 10");
			break;

			case 11: case 12: case 13: case 14: case 15: case 16: case 17: case 18: case 19: case 20:

			System.out.println(age + " is between 11 and 20");
			break;

			case 21: case 22: case 23: case 24: case 25: case 26: case 27: case 28: case 29: case 30:

			System.out.println(age + " is between 21 and 30");
			break;

			default:

			System.out.println("You are over 30");
		
		
		
		}
		
	
		
		
		if (colour.equals("balck")) {

			System.out.println("You must be a Goth!");

			}

			else if (colour.equals("White")) {

			System.out.println("You are a very pure person!");

			}

			else if (colour.equals("Red")) {

			System.out.println("You are fun and outgoing ");

			}

			else if (colour.equals("Blue")) {

			System.out.println("You’re not a Chelsea fan, are you?");

			}

			else {

			System.out.println("Sorry, didn't catch that!");

			}



	}
}

