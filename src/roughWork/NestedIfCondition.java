package roughWork;

public class NestedIfCondition {
	
	/**
	 * @param args
	 */
	public static void main(String[] args){
		
		 int User = 18;
		 String first = "Shade";
		 boolean user = false;
		 
		 
		 if(User <19 ) {
			 System.out.println("User is less than 19");
		 }
		 
		 if(User<19){
			 if(User>16 && User<19){
				 System.out.println("User is either 17 or 18");
			 }else{
				 System.out.println("User is 16 or younger than ");
			 }
		 }
		 
		 
		 if(user == true){
			 System.out.println("This shit is true");
		 }else{
			 System.out.println("This is False");
		 }
		
		if(!user){
			System.out.println(first +" You're lying girl");
		}else{
			System.out.println("It's true");
		}
	}

}
