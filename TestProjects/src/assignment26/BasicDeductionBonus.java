package assignment26;

import java.util.Scanner;

public class BasicDeductionBonus {
	// CalculationHraPf c =new CalculationHraPf();
	double basicPay;
	double deduction;
	double bonus;
	BasicDeductionBonus (){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the basic pay: ");
        basicPay = sc.nextDouble();
	//	System.out.println("Basic pay is: " + basicPay);
        System.out.println("enter the deducted amount: ");
	    deduction = sc.nextDouble();
	    System.out.println("enter the bonus: ");
        bonus = sc.nextDouble();
		
	}

	
	

}











// int choice;
// Scanner sc=new Scanner(System.in);
// do {
/*
 * System.out.println("1.Enter Basic Pay:");
 * System.out.println("2.Enter Deduction: ");
 * System.out.println("3.Enter Bonus: "); System.out.println("4.Exit");
 * choice=sc.nextInt(); switch(choice) { case 1: break; case 2: break; case 3:
 * break; case 4:break; default:System.out.println("invalid");
 * 
 * }
 * 
 * } while (choice != '4');
 * 
 * System.out.println("operations completed");
 */
