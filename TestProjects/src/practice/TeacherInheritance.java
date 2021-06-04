package practice;

 public class TeacherInheritance { 
	String designation ="Teacher";
	
	String collegeName= "BeginnersBook";
	
	void does() {            ////method
		System.out.println("Teaching");
	}}
	
	class ComputerTeacher extends TeacherInheritance{  //child class
		void does() {
			System.out.println("collegename is "+(super.collegeName));
			System.out.println("designation is is "+(super.designation));
		}
		

	}
	
	
