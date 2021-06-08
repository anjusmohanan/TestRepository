package practice;

public class ReverseNumber {

	public static void main(String[] args) {
		String reverse="";
		String b="raju";
		int s=b.length();
		for(int i=s-1;i>=0;i--) {
			reverse=reverse+b.charAt(i);
		}
		 System.out.println("reverse "+reverse); 
		 
		int n = 234;
		int remainder;
		int sum = 0;
		int temp;
		temp = n;

		while (n > 0) {
			remainder = n % 10;
			sum = (sum * 10) + remainder;
			n = n / 10;

		}

		System.out.println("reverse number is " + sum);

	}

	
	
	
	
}
