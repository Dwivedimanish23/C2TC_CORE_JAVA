package My_Package;
public class If_Else {
	public static void main(String[] args) {
		boolean b=true;
		if(b=false)
		{
			System.out.println("Good Morning");
		}
		else
			System.out.println("Good Evening");// curly braces are optional
		if(true); //Empty statement
		if(true)	
			{
			int x=10;
			}// else part is optional
		/*if(true)
			int y=10;   
	    Above statement is invalid.Because Without '{}' only one statement is valid 
	    and that should not be declarative statement.*/
		if(true)
			if(true)
				System.out.println("Hi kids");
		    else
				System.out.println("Hi Engineers");
		 /*while using nested if-else statement, else statement will always belong 
		    to nearest if statement.Applicable for all languages.*/
	}
}
/*Note:- The evaluation of if condition should give the result of datatype boolean.
  The result having datatype other than boolean will give error.*/
