package day1;

public class StudentExampleMethod {

	int sid;
String sname;
Double sub1,sub2,sub3;

void getStuData() {
	

	System.out.println("Student ID "+sid );
	System.out.println("Student Name "+sname );
}
void getStuMarks() {
	
	System.out.println("Markof subject1 " +sub1 );
	System.out.println("Markof subject2 " +sub2);
	System.out.println("Markof subject3 " +sub3 );
}

void totalMarks() {
	double mark;
	mark=sub1+sub2+sub3;
	System.out.println("Total Mark " +mark );	
}



public static void main(String[] args) {


	StudentExampleMethod st=new StudentExampleMethod();
st.sid=10;
st.sname="Malu";
	st.getStuData();
	st.sub1=30.50;
	st.sub2=50.0;
	st.sub3=60.50;
	st.getStuMarks();
	
	st.totalMarks();

}}