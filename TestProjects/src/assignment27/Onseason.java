package assignment27;

import java.util.Scanner;

public class Onseason {
	double totalAmount;
	double discountAmount;

	void discount() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the total amount: ");
				totalAmount=sc.nextDouble();
	discountAmount=(totalAmount*40)/100;
	System.out.println("Onseason discount Amount is: "+discountAmount);
	}
}
	
	
	
	
	
	
	
	
	


