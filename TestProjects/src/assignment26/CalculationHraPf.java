package assignment26;

//import java.util.Scanner;

public class CalculationHraPf {

	double hra;
	double pf;
	

	
	void hraPf(double basicPay) {
	
		
	hra=(basicPay*5)/100;
		System.out.println("HRA is: "+hra);
		
		
	}
	void pfAmount(double basicPay) {
	
		pf=(basicPay*20)/100;
		System.out.println("PF is: "+pf);
	}
	
	
	
}
