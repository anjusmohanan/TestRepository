package src;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number");
			int a=sc.nextInt();
			int rev=0;
			int rem;
			int temp;
			temp=a;
			while(a!=0) {
				rem=a%10;
				rev=rev*10+rem;
				a=a/10;
			}
			
			System.out.println("reversed number "+rev);
	
			if(rev==temp) {
				System.out.println("palindrome");
			}
			else
				System.out.println("not palindrome");
		}


	}


