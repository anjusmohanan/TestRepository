package practice;

public class EmployeeDetails {
	
	int id;
	String name;
	Address ad;
	
	EmployeeDetails(int id,String name,Address ad){
		this.id=id;
		this.name=name;
		this.ad=ad;
	}
	
	void getEmployeeDetails() {
		System.out.println("Name: "+name+", "+"ID: "+id);
		System.out.println("City: "+ad.city+", " +"State: "+ad.state+", "+"Country: "+ad.country);
	}
	
	public static void main(String[] args) {

Address ad1=new Address("PTA","KL","INDIA");
Address ad2=new Address("KLM","TN","IND");

		EmployeeDetails emp=new EmployeeDetails(1,"Manu",ad1);
		EmployeeDetails emp2=new EmployeeDetails(2,"Malu",ad2);
		emp.getEmployeeDetails();
		emp2.getEmployeeDetails();
		
	}

}
