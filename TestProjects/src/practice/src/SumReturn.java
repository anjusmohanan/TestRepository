package src;

public class SumReturn {
	int method() {
		int a=10;
		int b=3,c;
		c=a+b;
				return c;
	}

	public static void main(String[] args) {
		SumReturn s=new SumReturn();
	System.out.println("sum is" +s.method());	
	}

}
