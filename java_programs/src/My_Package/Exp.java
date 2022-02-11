package My_Package;

public class Exp {

	public static void main(String[] args) {
		System.out.println("Hi");
	
	try
	{
		System.out.println(10/0);
	}
	catch(ArithmeticException e)
	{
		System.out.println(e);
	}
	System.out.println("Hello");
	}
	
}
