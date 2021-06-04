package assignment27;

import java.util.Scanner;

public class Bank {
private int pin;

double balance;

Bank(){
	balance=5000;
}



void setPin(int pin) {

	this.pin = pin;
}
	boolean validatePin() { ///// got b.validatePin(u.getPin()); is passed to here.

		if (pin == 1001 || pin == 1234 || pin == 1212) {
			System.out.println("access granted");
			return true;
		}

		else {
			System.out.println("Account blocked");
			return false;
			
		}
		
	}

	void withdrawl() {
		Scanner sc = new Scanner(System.in);
		if((pin == 1001 || pin == 1234 || pin == 1212) ) {
		System.out.println("Withdrawl Amount is ");
		}
	//	else
			
		double withdrawl = sc.nextDouble();
		if (balance >= withdrawl) {
			balance = balance - withdrawl;
			System.out.println("Success");
		} else {
			System.out.println("Insufficient Balance");
		}

		this.showBalance();
	}	
	
	void showBalance() {

		System.out.println("Current Balance is " + balance);

	}
	
	
	
	
}
