package assignments24;

public class TotalAmountConstructor29 {

	double clothes;
	double vegetables;
	double t;


	TotalAmountConstructor29(double clothes,double vegetables) {
		t=clothes+vegetables;
	}
		void method1() {
		System.out.println("total amount "+t);
	}
	
	TotalAmountConstructor29(){
	t=clothes+vegetables;	
	}
	
	void method2()
	
	{
	
	if(t>=5000) {
		t=(t*20)/100;
		System.out.println("20% discount applied "+t);
	}
	else
	{
		System.out.println("No discount");
	}
	}
	
	
	
	
}
