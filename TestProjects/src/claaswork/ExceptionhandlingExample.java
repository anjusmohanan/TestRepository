package claaswork;

import java.util.Scanner;

public class ExceptionhandlingExample {

	 public static void main(String[] args) {
		int a,b,c;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of a:");
		a=sc.nextInt();
		System.out.println("Enter value of b:");
		b=sc.nextInt();
		
		
		
		try {
			c=a/b;
			
			
		}catch(Exception e) {
			
				System.out.println("enter value of b>0 ");
				b=sc.nextInt();
				c=a/b;
			
		}
		System.out.println("Value of c: "+c);	
			
		}
		
		
		
	}
	
	


