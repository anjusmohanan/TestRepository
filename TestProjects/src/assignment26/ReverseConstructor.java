package assignment26;

import java.util.Scanner;

public class ReverseConstructor {
int number;
int reverse=0;


	ReverseConstructor(int num){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number ");
		number=sc.nextInt();
		
	
        while(number!=0){
		int reminder=number%10;
		reverse=reverse*10+reminder;
		number=number/10;
		}
		}
		
		ReverseConstructor(){
			this(0);
			
		///	ReverseConstructor r=new ReverseConstructor(123);
			
		System.out.print("reversed number is "+this.reverse );
		}
	}

