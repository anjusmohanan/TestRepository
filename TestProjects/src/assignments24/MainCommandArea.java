package assignments24;

import java.util.Scanner;

public class MainCommandArea {

	public static void main(String[] args) {

		AreaCommand a = new AreaCommand();

		char choice;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("a.Area Circle");
            System.out.println("b.Area Rectangle");
			System.out.println("c.Area Square");
			System.out.println("d.Exit");
			choice = sc.next().charAt(0);
			switch (choice) {

			case 'a':
				a.areaCircle();

				break;
			case 'b':
				a.areaRectangle();

				break;

			case 'c':
				a.areaSquare();
				break;
			case 'd':break;// if write here exitthe the print statmnt writing after the while is not executed.'exit' from whole program. break
			                              stemnt is for only exit from the loop
				
			default:
				System.out.println("invalid");
			}
		} while (choice != 'd');

           System.out.println("operations completed");

	}
}
