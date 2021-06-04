package practice;

public class ArrayString {


	public static void main(String[] args) {
		String a[]= {"rose","Hibis","lilly"};
		String s="Hibis";
		for(int i=0;i<a.length;i++) {
			if(a[i]==s)
			{
				System.out.println("Found "+s+ " position "+(i+1));
				
			}
		}
	

	}

}
