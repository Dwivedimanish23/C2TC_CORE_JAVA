package My_Package;
import java.util.Scanner;

public class Switchcase {

	public static void main(String[] args)
	{
		int m;
		System.out.println("Enter the case:");
		
		Scanner input = new Scanner(System.in);
		m = input.nextInt();
		
		switch(m) 
		{
		default:
			System.out.println("default");
			break;	
		case 0:
			System.out.println(0);
			break;	
		case 1:
			System.out.println(1);
			break;
		case 2:
			System.out.println(2);	// break statement is optional for last case.		
	    }
		
		int x=10;
		final int y=20;
		switch(x) {};  //Empty switch is valid.
		
		switch(x)
		{
		case 10:
			System.out.println(10);
			break;	
		case y: // case label should be constant.here y is constant as it is declared as final.
			System.out.println(2);
			//  default case is optional.
		}
		
		switch(x+1)   //adding 1 to x of type int, hence valid.
		{
		case 11:
			System.out.println(11);
			break;	
		case 100+200: //constant expression as a case label is valid.
			System.out.println(300);
			break;
		}
		
/*		byte a=10;
		switch(a)   //adding 1 to x of type int, hence valid.
		{
		case 1000:         --Invalid case label: 1000 is not falling in range of byte.
			System.out.println(10);
			break;	*/
		
/*       int w=10;
		switch(b) 
		{
			
		case 97:                      //Duplicate case
			System.out.println(10);
			break;	
		case 1:
			System.out.println(100);
			break;
		case 'a':                     //Duplicate case...Here w is of type int hence we get unicode value of label 'a' as 97.  		                               
			System.out.println(1000);			
	    }*/
	}
}
/*Note: x variable in switch statement can have byte, short, char, int datatypes.
  boolean, float, double & long datatypes are not allowed.
  Later in 1.5, wrapper classes and Enum are added.
  In 1.7, String is added.*/ 
