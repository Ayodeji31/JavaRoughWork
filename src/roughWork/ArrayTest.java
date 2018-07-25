package roughWork;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayTest {
	public static void main (String [] args){
//		
//		int [] lottery_numbers = new int [59];
//		
//		int i;
//		
//		for (i = 0; i < lottery_numbers.length; i++){
//			lottery_numbers[i] = i + 1;
//			System.out.println( lottery_numbers[i] );
//		}
		
		String[] aryString = new String[9];
		
		aryString[0]= "This";
		aryString[1]= "is";
		aryString[2]= "a";
		aryString[3]= "string";
		aryString[4]= "array";
		aryString[5]= "trust";
		aryString[6]= "you";
		aryString[7]= "know";
		aryString[8]= "that.";
		
		int a;
		
		for (a=0;a<aryString.length;a++){
			System.out.println(aryString[a]);
		}
		
		
		int [] aryNums;
		aryNums = new int [6];
		
		aryNums[0] = 10;
		aryNums[1] = 14;
		aryNums[2] = 36;
		aryNums[3] = 27;
		aryNums[4] = 43;
		aryNums[5] = 18;
		
		Arrays.sort(aryNums);
		
		int i;
		
		for (i=0; i < aryNums.length; i++){
			System.out.println("num:" + aryNums[i] );
		}
		
		
		ArrayList listTest = new ArrayList();
		
		listTest.add("Ayodeji");
		listTest.add("Ayomide");
		listTest.add("Omolola");
		listTest.add("Ademola");
		listTest.add(16);
		listTest.add("Beatrice");
		
		Iterator it = listTest.iterator();
		
		while (it.hasNext()){
			System.out.println(it.next());
		}		
		
//		listTest.remove(3);
		System.out.println(listTest.remove(0));
		System.out.println("Whole list " + listTest);
		System.out.println("Position 2 "+  listTest.get(2));
		
		
	}

}
