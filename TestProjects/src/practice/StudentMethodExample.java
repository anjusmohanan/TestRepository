package practice;

public class StudentMethodExample {
	int SID;
	String Sname;
	String sub1;
	String sub2;
	String sub3;
	double mark1;
	double mark2;
	double mark3;
	 double totalmark;
void getStuData(int id,String name){
		SID=id;
		Sname=name;
		System.out.println("student name "+name )	;
		System.out.println("student id "+id );
	}
void getStuMarks() {
	 mark1=35.5;
	 mark2=45.50;
	 mark3=50.50;
	totalmark=(mark1+mark2+mark3); 
	}
void totalMarks() {
	this.getStuMarks();
	
	System.out.println("total mark is "+totalmark);
	

	
	
}



	
	
	public static void main(String[] args) {
		StudentMethodExample gs =new StudentMethodExample();
		//gs.SID=2;
		//gs.Sname="raju";
		gs.totalMarks();
		
	gs.getStuData(2, "Raju");

	}

}
