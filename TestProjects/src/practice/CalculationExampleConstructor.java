package practice;

public class CalculationExampleConstructor {
	
	int a,b,c;
	int s;
	
	CalculationExampleConstructor(int a,int b,int c){
		
		this.a=a;
		this.b=b;
		this.c=c;
	
		
	}
	
	void sumMethod() {
		 s=a+b+c;
		System.out.println("sum of variable is "+s);
	}
	
	

	public static void main(String[] args) {
		CalculationExampleConstructor sm=new CalculationExampleConstructor	(3,4,5);
		sm.sumMethod();

	}

}
