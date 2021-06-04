package assignments24;

public class GradeMain30 {

	public static void main(String[] args) {
		System.out.println("enter details student1 ");
		Student30 s1=new Student30();
		System.out.println("enter details student2 ");
		Student30 s2=new Student30();
	int total1=s1.totalMark();
	int total2=s2.totalMark();
	s1.grade(total1);
	s2.grade(total2);
	
	}

}
