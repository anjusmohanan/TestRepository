package practice;

public class CalculationMethod {
	/*int x=3;
	int y=7;
	int z=4;
	double x=3;
	double y=4;
	double z=5;*/
	
	
	int sum(int x,int y) {
		//x=10; correct.got o/p.but we must pass the values.so give values at the time of calling using object.
		//y=5;
		return(x+y);
		//System.out.println("sum is "+ return(x+y));  error
	}

	void sum1(int x,int y) {
	//x=4;
	//y=6;
	System.out.println("sum is "+(x+y));
	}
	
	
	int sum(int x,int y,int z) {
		return(x+y+z);
	}
	double sum(double x,double y) {
		return(x+y);
		
	}
	
	double sum(double x,double y,double z) {
		return(x+y+z);
		
	}
	
	public static void main(String[] args) {
		CalculationMethod c=new CalculationMethod();
		c.sum(1,2);
		c.sum(1, 2, 3);
		c.sum(1.00, 2.00,3.00);
		c.sum(2.00, 5.00);
		//System.out.println("sum is "+c.sum(1, 2) );
		System.out.println("sum is "+c.sum(1, 2, 3));
		System.out.println("sum is "+ c.sum(1.00, 2.00,3.00));
		System.out.println("sum is "+ c.sum(2.00, 5.00));
	c.sum1(4, 7);
	
	
	}
	
	
	

}
