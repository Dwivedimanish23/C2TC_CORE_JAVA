package My_Package;
	class one {
		public void print_A()	
		{
			System.out.println("Prathamesh");
		}
	}

	class two extends one {
		public void print_B()
	
		{ System.out.println("Gaikar"); }
	}

	public class Single_Inheritance {
		public static void main(String[] args)
		{		
			two I = new two();

			I.print_A();
			I.print_B();
	
		}

}
