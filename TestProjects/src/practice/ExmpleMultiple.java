package practice;




interface A {
	int a = 10;

	abstract void method1();

	interface B {
		int x = 20;

	abstract	void method2();
	}

	public class ExmpleMultiple  implements A,B{
public void method1() {
	System.out.println("value of a is "+a);
}
public void method2() {
	System.out.println("value of x is "+x);
}

	public static void main(String[] args) {
		ExmpleMultiple m=new ExmpleMultiple();
m.method1();
m.method2();

	}
	
}}



	

