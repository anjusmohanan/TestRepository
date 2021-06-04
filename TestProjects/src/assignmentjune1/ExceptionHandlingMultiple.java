package assignmentjune1;

public class ExceptionHandlingMultiple {

	public static void main(String[] args) {
		int a = 10;
		int x;
		String s = "example";
		int m[] = new int[4];
		try {
			x = a / 0;

		} catch (ArithmeticException ae) {
			System.out.println("Invalid division");
			System.out.println(ae);
		}

		try {
			int b = Integer.parseInt(s);
		} catch (NumberFormatException ne) {
			System.out.println("Format mismatch");
			System.out.println(ne);
		}
		try {
			s.charAt(10);
		} catch (StringIndexOutOfBoundsException se)

		{
			System.out.println("Index is invalid");
			System.out.println(se);
		}

		try {
			m[7] = 20;
		} catch (ArrayIndexOutOfBoundsException aie) {
			System.out.println("Array index is invalid");
			System.out.println(aie);
		}
	}
}
