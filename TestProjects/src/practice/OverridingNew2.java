package practice;

public class OverridingNew2 extends OverridingNew1{

	int method1() {
		//super.a=a;
		//int b=10;
	//	int c;
		//c=a+b;
		//System.out.println("sum is "+c);
		return 2;
	}
	
	
	public static void main(String[] args) {
		OverridingNew2 o2=new OverridingNew2();
		System.out.println(o2.method1());
		OverridingNew1 o1=new OverridingNew1 ();
		System.out.println(o1.method1());
	}

}
