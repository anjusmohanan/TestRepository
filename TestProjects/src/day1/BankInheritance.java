package day1;

public class BankInheritance {


	public static void main(String[] args) {

BankAxis ba=new BankAxis();

ba.interestRate=10.00;
ba.totalAccounts=2400;
ba.axisBank();  //child method

ba.interest=11.50;
ba.NumberofEmployees=250;
ba.bankRBI(); //parent method


	}

}
class BankRBI{
	private int NumberofAccounts;
	protected int NumberofEmployees;
	double interest;
	
	void bankRBI() {
		System.out.println("Interest rate is "+interest);
		System.out.println("Total accounts "+NumberofAccounts);
		System.out.println("Total number of Employees "+NumberofEmployees);
	}
}
class BankAxis extends BankRBI{
int totalAccounts;
double interestRate;

void axisBank() 
{
	System.out.println("Interest rate is "+interestRate);
    System.out.println("Total number of accounts "+totalAccounts);
}

}






