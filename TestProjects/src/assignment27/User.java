package assignment27;

import java.util.Scanner;

class User {

	private int pin;

	public int getPin() {

		return pin;

	}

	void setPin(int pin) {

		this.pin = pin;
	}

	public static void main(String[] args) {

		User u = new User();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the pin");
		int pin = sc.nextInt();
		u.setPin(pin);
		Bank b = new Bank();
		b.setPin(u.getPin());
		boolean result = b.validatePin();
		if (result) {

		}
b.withdrawl();
	}
}
