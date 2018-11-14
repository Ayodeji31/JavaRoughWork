package Exam;

public class StudentResults {

	private String Full_Name;
	private String Exam_Name;
	private String Exam_Score;
	private String Exam_Grade;
	
	
	StudentResults(){
		
		Full_Name = "No name Given";
		Exam_Grade = "Unknown";
		Exam_Score = "No Score";
		Exam_Name = "Unknown";
	}
	
	String full_Name(String aName){
		Full_Name = aName;
		return Full_Name;
	}
	
	
}
