package assignment27;
import address.Address;

public class Student {

	String studentName;
	int rollNumber;
	assignment27.Address address;
	Student(String studentName,	int rollNumber,assignment27.Address address){
	this.studentName=studentName;
	this.rollNumber=rollNumber;
	this.address=address;
	
}
void display() {
	System.out.println("Student Name :"+studentName+"\n " +"Roll Number: "+rollNumber);
	System.out.println("Address :"+address.city+"\n"+ address.state+"\n"+address.country);
}

	
           public static void main(String[] args) {
        	   assignment27.Address address1=new assignment27.Address("PTA","KL","IND");
        	   assignment27.Address address2=new assignment27.Address("EKM","KL","IND");
        	   Student s=new Student("Anish",1,address1);
        	   Student s1=new Student("Vineeth",2,address2);
        	   s.display();
        	   s1.display();


	}

}
