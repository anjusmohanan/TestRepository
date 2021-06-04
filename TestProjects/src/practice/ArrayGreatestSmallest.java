package practice;

public class ArrayGreatestSmallest {

	public static void main(String[] args) {
		int a[]= {2,5,8,1};
		int largest=a[0];
		int smallest=a[0];
		

for(int i=0;i<a.length;i++) {
	if(a[i]>largest)
	{
		largest=a[i];
	}
	if(a[i]<smallest) {
		smallest=a[i];
		
	}
}
System.out.println("Largest Number is : " +largest);
System.out.println("Smallest Number is : " +smallest);
	}

}
