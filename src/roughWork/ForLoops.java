package roughWork;

import java.util.Scanner;

public class ForLoops {
	
	
	public static void main(String[] args){
		
		
		int loopVal;
		
		int end_value = 11;
		
		int addition = 10;
		
		int times_table = 0;
		
		
		Scanner user_input = new Scanner(System.in);
		System.out.println("Which times table do you want?");
		times_table = user_input.nextInt();
		
		
		for (loopVal = 1; loopVal < end_value; loopVal++){
			
			addition = addition + loopVal;
			
			System.out.println(" Total Value = " + addition);
			
		}
		for (loopVal = 1; loopVal < end_value; loopVal++) {

			addition = loopVal * times_table;

			System.out.println(loopVal + " times " + times_table + " = " + addition);

		}
			
		
		
	}

}
