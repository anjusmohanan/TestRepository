package src;

public class Fibonacci {

	public static void main(String[] args) {
	int n=6;
	int firstNum=0,secNum=1,nextNum;
	System.out.print(firstNum+" "+secNum+",");
	for (int i=3;i<=6;i++) {
		nextNum=firstNum+secNum;
		firstNum=secNum;
		secNum=nextNum;
		System.out.print(nextNum+",");
	}

	}

}
