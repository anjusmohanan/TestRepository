package assignment26;

public class FactorialMethod {

	 int fact;  
	 
	  int number;
	  void method1(int number) {
		  this.number=number;
	  fact=1;
	  for(int i=1;i<=number;i++){    
	      fact=fact*i;    
	  }  
	  
	  
	  }
	  
	  void method2() {
		 this.method1(4);
	  System.out.println("Factorial of "+number+" is "+fact );    
	 }  
	

}
