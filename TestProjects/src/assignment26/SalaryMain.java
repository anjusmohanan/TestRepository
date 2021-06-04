package assignment26;

public class SalaryMain {

	  double totalSal;
	
	public static void main(String[] args) {
		
		

		 BasicDeductionBonus bd=new BasicDeductionBonus();
		
		
		 CalculationHraPf c=new  CalculationHraPf();
	     c.pfAmount(bd.basicPay);
		 c.hraPf(bd.basicPay);
		
		 SalaryMain s=new SalaryMain();
		 s.totals(bd,c);
		 
			

	
		 System.out.println("Salary Slip:..............");
		 System.out.println("Basic pay is: "+bd.basicPay);
		 System.out.println("Deducted amount is: "+bd.deduction);
		 System.out.println("Bous is:"+bd.bonus);
		 System.out.println("HRA is :"+c.hra);
		
		 System.out.println("PF is: "+c.pf);	 
		 
		 System.out.println("total salary: "+s.totalSal );
		 
		 
	}
	


  
    
    void totals(BasicDeductionBonus bd,CalculationHraPf c) {
	totalSal=(bd.basicPay+c.hra-c.pf-bd.deduction+bd.bonus);
	
	
}

	
	
	
	
}
