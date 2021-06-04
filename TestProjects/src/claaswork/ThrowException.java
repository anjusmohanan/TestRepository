package claaswork;

import java.util.Scanner;

public class ThrowException {

	public static void main(String[] args) {
		int age;
		Scanner sc=new Scanner(System.in);
	System.out.println("Enter age");
		age=sc.nextInt();
		
		try {
			if(age<18)
				throw new VotingException("Not Eligible for voting");
			
		}
		catch(VotingException ve) {
			System.out.println("ve");
			System.out.println(ve.getMessage());
			
		}

	}

}
