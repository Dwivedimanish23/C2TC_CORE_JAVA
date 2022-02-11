package My_Package;
public class Dowhile
{

	public static void main(String[] args) 
	{
/*		do
			int x=10;	  
		while(true);  //declarative statement without curly braces.Invalid
		*/
/*		do
			
		while(true);    //Body of the loop is missing.
		                  There should be some action which has to be executed atleast once.
		*/
		
/*		do;	
		
		while(true);  //Empty body with semicolon is valid.*/
		 // above code is commented because of the below code is infinite loop. 
		
		do
			System.out.println("Hello Kids");
		    while(true);
	}

}
