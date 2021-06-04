package assignment27;

 class Offseason extends Onseason{
	
	void discount() {
	double offdiscount;	
	
	super.discount();
	offdiscount=(super.totalAmount*15)/100;
	System.out.println("Offseason discount Amount is: "+offdiscount);
	}
	public static void main(String[] args) {
	Offseason off=new Offseason();
	off.discount();
	
	}
	
}
	
	
	
	

	
	




