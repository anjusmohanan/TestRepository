package day0;

import java.util.Scanner;

public class MenuDriven {

	public static void main(String[] args) {
		int choice;
		int a,b;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("1.addition");
			System.out.println("2.sub");
			System.out.println("3.exit");
			choice=sc.nextInt();
			switch(choice) {
			
			case 1:System.out.println("enter values");
			       a=sc.nextInt();
			       b=sc.nextInt();
			       System.out.println("sum ="+(a+b)); 
			       break;
			case 2:System.out.println("enter values");
		       a=sc.nextInt();
		       b=sc.nextInt();
		       System.out.println("difference="+(a-b)); 
		       break;
			case 3:System.exit(0);
			default: System.out.println("invalid");     
			}
		}while(choice!=3);
	
		  System.out.println("operations completed");
		
		
	}

}



