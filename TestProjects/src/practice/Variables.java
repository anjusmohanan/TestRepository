package practice;

public class Variables {
	 int x=1;// instance variable
	int y=12;// instance variable
	static float g=18;// static variable
int method1() {

    int a; // local variable
	int output=x+y;
	return output;	
	
	

//System.out.println(Variables.g);

}
	public static void main(String[] args) {

Variables v=new Variables();
v.method1();


System.out.println(Variables.g);

	}
}

