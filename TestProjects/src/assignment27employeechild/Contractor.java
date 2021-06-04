
package assignment27employeechild;
import java.util.Scanner;

import assignment27.*;
public class Contractor extends Employee {
int workingHours;
public Contractor() {
	System.out.print("Enter the basic Pay: ");
	Scanner sc=new Scanner(System.in);
	basicPay=sc.nextDouble();
	System.out.print("Enter working Hours: ");
	workingHours=sc.nextInt();
}
public void calculateSalary() {
	totalSalary=basicPay*workingHours;
	System.out.println("Total Salary of contractor Employee is : "+totalSalary);
}



}



