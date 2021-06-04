package day0;

public class NewMethod1 {
	
	

 public void sum(int a) {
	 
	 
System.out.println("output "+a)	;
this.sum(2, 3.43);

}
	
public void  sum(int a, double b){
	
	System.out.println("output "+a);
	System.out.println("output "+b);
	
	
}
	
	
	public static void main(String[] args) {
	NewMethod1 s=new NewMethod1();
	s.sum(2);
	

	

}
}