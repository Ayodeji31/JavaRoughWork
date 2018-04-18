package roughWork;

public class ConditionalIfStatement {
	
	public static void main(String[] args){
		
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
	}

}
