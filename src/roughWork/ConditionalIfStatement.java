package roughWork;

public class ConditionalIfStatement {
	
	 
	
	public static void main(String[] args){
		
		int speed = 60;
		
		int user = 50;
		
		
		if(user<=18){
			
			System.out.println("You're a small boy");			
		}
		
		else if (user >=18 && user <= 30){
			
			System.out.println("You're a Big boy");
		}
		
		else if(user==40 || user == 50){
					
			System.out.println("User is either 40 or 50");
		}
		
		else{
			
			System.out.println("User is older than 40");
		}
		
		if(speed==60){
			System.out.println("Thank you");
		}else{
			System.out.println("Reduce your speed, speed kills");
		}
	}

}
