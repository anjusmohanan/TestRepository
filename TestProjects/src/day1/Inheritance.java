
		package day1;

		public class Inheritance {

			public static void main(String[] args) {
				
		
				

				ChildB objB=new ChildB();
				System.out.print(objB.a);
				//System.out.print(objB.b);
		}
		}

				class ParentA{
				int a;
				private int b;
				ParentA(){//constructor
				b=5;
				a=7;
				}
				}
				

				class ChildB extends ParentA{
				protected int c;
			
				ChildB(){  ///constructor
				super();
				a=16;
				}
			
		}







