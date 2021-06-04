package assignments24;

import java.util.Scanner;

public class BankMenudriven {

	public static void main(String[] args) {
		BankMenudrivenMethod b = new BankMenudrivenMethod();

		int choice;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("1.Deposit");

			System.out.println("2.Withdrawl");
			System.out.println("3.Balance");
			System.out.println("4.exit");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				b.deposit();
				break;
			case 2:
				b.withdrawl();

				break;

			case 3:
				b.showBalance();
				break;
			case 4:
				break;
			default:
				System.out.println("Invalid");

			}
		} while (choice != 4);

	}
}
