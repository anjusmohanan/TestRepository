package assignments24;

import java.util.Scanner;

public class BankMenudrivenMethod {

	double balance;
	
	BankMenudrivenMethod(){
		balance=0;
	}

	
	
	

	void deposit() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Deposit Amount is");
		double deposit = sc.nextDouble();
		balance = balance + deposit;
		this.showBalance();

	}

	void showBalance() {

		System.out.println("Current Balance is " + balance);

	}

	void withdrawl() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Withdrawl Amount is ");
		double withdrawl = sc.nextDouble();
		if (balance >= withdrawl) {
			balance = balance - withdrawl;
			System.out.println("Success");
		} else {
			System.out.println("Insufficient Balance");
		}

		this.showBalance();
	}

}

	

