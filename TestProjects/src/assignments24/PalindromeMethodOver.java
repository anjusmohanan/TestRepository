package assignments24;

import java.util.Scanner;

public class PalindromeMethodOver {

	void palindrome(int n) {
		int remainder, sum = 0, temp;
		temp = n;
		while (n > 0) {
			remainder = n % 10;
			sum = (sum * 10) + remainder;
			n = n / 10;
		}
		if (temp == sum)
			System.out.println("palindrome number ");
		else
			System.out.println("not palindrome");
	}

	void palindrome() { ////////// using scanner

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word");
		String a = sc.next();

		String reverse = "";
		for (int i = (a.length() - 1); i >= 0; i--) {
			reverse = reverse + a.charAt(i);
		}
		System.out.println("reverse word is " + reverse);
		if (a.equals(reverse)) {
			System.out.println("Given word is Palindrome");
		} else
			System.out.println("Given word is NOT Palindrome");

	}



void palindrome(String b) { ////////////using parameter passing
  String reverse="";// initialize the string  if it is no. then int a=0; for initializing a.'

 int s;
		 s=b.length();
 for(int i=s-1;i>=0;i--) { 
	 reverse=reverse+b.charAt(i) ; 
	 }
 System.out.println("reverse "+reverse); 
 if(b.equals(reverse)) 
 {
System.out.println("Palindrome");

}
 else 
	 System.out.println("Not Palindrome");

 
 
}}
