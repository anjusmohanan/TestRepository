package assignments24;

import java.util.Scanner;

public class Student30 {

	String studentName;
	int id;
	int mark[];
	//int total=0;
	
Student30(){
	Scanner sc= new Scanner(System.in);
	System.out.print("Enter Student Name :");
	studentName=sc.next();
	System.out.print("Enter Student ID :");
	id=sc.nextInt();
	System.out.print("Enter three marks:");
	mark=new int[3];
	for(int i=0;i<3;i++) {
		mark[i]=sc.nextInt();
		
	}

	
}

int totalMark() {
int total=0;
for(int i=0;i<3;i++) {
	total=total+mark[i];
}
return total;
	
	
}

void grade(int total) {
	System.out.print(this.studentName);
	if ((total/3)>80) {
		System.out.print(" Grade is A ");
	} else if ((total/3)>60 && (total/3)<=80) {
		System.out.print(" Grade is B ");
	} else if ((total/3)>40 && (total/3)<=60) {
		System.out.print(" Grade is C ");
	} else {
		System.out.print(" Grade is D ");
	}

}







}

	
	

