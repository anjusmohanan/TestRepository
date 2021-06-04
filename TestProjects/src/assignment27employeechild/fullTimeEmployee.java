package assignment27employeechild;
import assignment27.Employee;
import java.util.Scanner;
public class fullTimeEmployee extends Employee {
	int days;
	public fullTimeEmployee() {
		System.out.println("full time Employee Details: ");
		
		System.out.println("basic pay per month: ");
		Scanner sc=new Scanner(System.in);
		basicPay=sc.nextDouble();
		System.out.println("working days :");
		days=sc.nextInt();
		
	}

	
	public void calculateSalary() {
		totalSalary=basicPay*days*8;
		System.out.println("Salary of Full time "+totalSalary);
	}
}
