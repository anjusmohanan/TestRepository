package practice;

import java.util.Scanner;

public class AddInheritancediffPackage {
	int a, b;
	int sum;

	public void addition() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the numbers :");
		a = sc.nextInt();
		b = sc.nextInt();
		sum = a + b;
		System.out.println("Sum of given numbers is " + sum);

	}
}
