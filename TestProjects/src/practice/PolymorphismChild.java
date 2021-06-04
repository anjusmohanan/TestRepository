package practice;

public class PolymorphismChild extends Polymorphism {
		 void method1(int b) {
			// super.method1(9);
		System.out.println("this is overrinding");
		System.out.println("value of b is: "+b);
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
//	PolymorphismChild pc=new PolymorphismChild();
		//.method1(4);
		//
	
	PolymorphismChild p=new PolymorphismChild();
		p.method1(5);
		p.display();
	//	Polymorphism d=new Polymorphism();
		//d.method1(6);
		//p.method1(3);
		//Polymorphism.method1(7);
	}


}