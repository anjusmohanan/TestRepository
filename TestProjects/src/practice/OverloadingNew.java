package practice;

public class OverloadingNew {
	
	int a,b,c,d;
void method1(int a,int b) {
c=a+b;	
System.out.println("c is"+c);
}
void method1(int a,int b,int d)	{
	c=a+b+d;
	System.out.println("c is"+c);	
}
	
	
	
	
	
	public static void main(String[] args) {
	
		 OverloadingNew o=new  OverloadingNew();
		 o.method1(12, 13);
		 o.method1(14, 15, 16);
	}

}
