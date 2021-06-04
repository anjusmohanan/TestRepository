package assignments24;

public class CustomerDiscount26 {
static	double cloths,vegetables,fruits;
	static double t;

static void totalAmount(double clothes,double vegetables ,double fruits) {
	t=clothes+vegetables+fruits;
System.out.println("total amount is "+t);
	
	
}
	
static void checkDiscount() {
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
