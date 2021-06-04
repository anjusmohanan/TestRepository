package assignment26;

import practice.AddInheritancediffPackage;

public class DivisibleAddInheritance extends AdditionNumbers {

	void addition() {

		int result;
		AddInheritancediffPackage a = new AddInheritancediffPackage();
		a.addition();
		// super addition();
		result = sum % 10;
		if (result == 0) {
			System.out.println("divisible by 10");
		} else
			System.out.println("not divisible by 10");

	}

	public static void main(String[] args) {
		DivisibleAddInheritance d = new DivisibleAddInheritance();
		d.addition();

	}

}
