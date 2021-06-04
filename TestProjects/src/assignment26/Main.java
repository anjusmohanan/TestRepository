package assignment26;

class Main extends AdditionNumbers {

	void sumNum(int x,int y)  {
		int t;
		super.sumNum(x,y);// only in overring write super must.then we get the parent values to the child. if no over riding
		                   //  the two method names in the parent and child class is not same .the variable in parent class is 
		                                 // instance then we can use the values in child directly.if it is localit can access through object.

		t = super.sum % 10;
		if (t == 0) {
			System.out.println("divisible by 10");
		} else
			System.out.println("not divisible by 10");
	}

	public static void main(String[] args) {

		
		Main d = new Main();
	d.sumNum(60,12);

		
		
	}

}
