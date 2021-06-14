package src;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the word ");
String s=sc.next();
int k=s.length();
String reverse="";
for(int i=k-1;i>=0;i--) {
	reverse=reverse+s.charAt(i);
}

System.out.println("reversed number "+reverse);
	}

}
