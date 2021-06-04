package day1;

public class CalculationExampleConstructor {

	int a,b,c;
	
	CalculationExampleConstructor(int x,int y,int z){
	a=x;
	b=y;
	c=z;
		}
	void sum()
	{
		int result=a+b+c;
		System.out.println("sum is " +result);
	}
	
	public static void main(String[] args) {
		CalculationExampleConstructor c=new CalculationExampleConstructor(10,20,30);
		c.sum();
	}
	
}


