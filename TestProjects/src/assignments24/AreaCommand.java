package assignments24;

import java.util.Scanner;

public class AreaCommand {

	void areaCircle() {
		double r;

		final double pi = 3.14;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter radius ");
		r = sc.nextDouble();
		double areaCircle = (3.14 * r * r);
		System.out.println("Area of circle is " + areaCircle);

	}

	void areaRectangle() {
		int l,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter length l ");
		l=sc.nextInt();
		System.out.println("enter breadth b ");
		b=sc.nextInt();
		int areaRectangle=(l*b);
		System.out.println("Area of rectangle is "+areaRectangle);

	}

	void areaSquare() {
        int a;
        Scanner sc = new Scanner(System.in);
		System.out.println("enter length a");
		a=sc.nextInt();
		int areaSquare=(a*a);
		System.out.println("Area of rectangle is "+areaSquare);
	
	}

	

}
