package day0;

public class Constructor {

	public static void main(String[] args) {
		
      Addition ad=new Addition(); // ad.a=10 ad.b=20
		ad.add();

			}

		}
		class Addition{
			int a;
			int b;
			Addition(){
				a=10;// assign a=10 for the object ad 
				b=20;
			
			}
		void add()
		{
			System.out.println((a+b));
		}


		}




	

