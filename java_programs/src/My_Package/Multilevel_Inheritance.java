package My_Package;
	
	class First {
		public void print_A()	
		{
			System.out.println("Prathamesh");
		}
	}

	class Second extends one {
		public void print_B()

		
		{ System.out.println("Gaikar"); }
	}

	class Third extends two {
		public void print_C()

		
		{ System.out.println("Badlapur"); }
	}

	public class Multilevel_Inheritance 
	{
		public static void main(String[] args)
		{
			Third I = new Third();

			I.print_A();
			I.print_B();
			I.print_C();
		}

}
