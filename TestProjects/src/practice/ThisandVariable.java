package practice;

/* class Thisand {
	
	void method12() {
		System.out.println("checking method12 parent class");
	}
	
	//String name="Test";
}
class Child extends Thisand {
	//String name="java";
	void method2() {
		super.method12();
		//System.out.println("child class method");
		
	}}
public class ThisandVariable{
	public static void main(String args[]) {
		Child c=new Child();
		c.method2();
	}
}

//class ThisandVariable{
	
	//String name="Molu";
	
	
	
/*}
	
	class Derivedclass extends ThisandVariable{
		String name="Manu";
		void small() {
			System.out.println("name is "+super.name);
		}
	}
*/


	
/*void sumCheck(){
	System.out.println("call sumCheck method");
}
	
	
void forChecking() {
	this.sumCheck();
}
	
	
public static void main(String[] args) {
	
	
	ThisandVariable c=new ThisandVariable();
	c.forChecking();
	
}
	
	
	
}*/


class Thisand{
	Thisand(){
		System.out.println("first construcor");
		
	}
	Thisand(int a){
	this();
	System.out.println(a);
}}

public class ThisandVariable{
	public static void main(String args[]) {
		Thisand c=new Thisand(10);


	}}










