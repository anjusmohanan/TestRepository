package practice;
public class B{
	
	 public static void main(String[] args) {
	int a=10,b=0,c;
System.out.println("program start");

	//try {
		c=a/b;
//	}
	//catch(ArithmeticException e) {
		//System.out.println(e);	
	//}
	
	System.out.println("program end");
	 }
	static void method1()throws ArithmeticException{
	throw new ArithmeticException();}

///static void method1()throws IOException{
	



}














/*abstract class C{
	int b=10;
	abstract void method1();
	void method2 () {
		System.out.println("print b :"+b);
	}
}



class B extends C{
	void method1() {
		System.out.println("This is from parent ");
	}
	
	  public static void main(String[] args) {
		B c=new B();
		c.method1();
		c.method2();
	}
}

*/
























/*interface A{
	int a=10;
	abstract void method1();
	
}
interface C{
	int m=20;
	void method2();
	
	}

public class B implements A,C{
	public void method1() {
		System.out.println("value of a is:"+a);
	}
	public void method2() {
		System.out.println("value of a is:"+m);
	}

	

	public static void main(String[] args) {
		//B b=new B();
		//b.method1();
		A a=new B();
		a.method1();
		C c=new B();
		c.method2();
		
		B b=new B();
		b.method1();
		b.method2();
	}

}
*/