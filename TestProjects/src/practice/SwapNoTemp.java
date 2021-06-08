package practice;

public class SwapNoTemp {

	public static void main(String[] args) {
		int x=30;
		int y=20;
		System.out.println("value of x and y before swapping "+(x+","+y));
         x=x+y;
         y=x-y;
         x=x-y;
         System.out.println("value of x and y after swapping "+(x+","+y));  
	}

}
