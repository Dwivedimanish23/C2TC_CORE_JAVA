package My_Package;
import java.util.Scanner;

public class UserDefinedExceptionProgram 
{
	public static void main(String[] args) throws DrivingLicence
	{
		int age;
		System.out.println("Enter the age");
		Scanner s = new Scanner(System.in);
	    age =s.nextInt();
	    if(age<18)
	    {
	    	throw new DrivingLicence("You cannot get driving licence");
	    }
	    else
	    {
			System.out.println("You can get driving licence");
	    }
	}
}
class DrivingLicence extends Exception
{
	DrivingLicence(String msg)
	{
		super(msg);
	}
}