package My_Package;
public class Forloop {

	public static void main(String[] args)
	{
		for(int i=0;i<10;i++); //Empty body ended with semicolon. Valid
		
		for(int i=0;i<1;i++)
			System.out.println("Mango"); //curly braces are optional.
		
/*		for(int i=0;i<10;i++)
			int x=10;  //declarative statement without curly braces.Invalid
		*/
		
		for(int i=0, j=0;i<10;i++); // we can declare any no. of variables having same data type
			
/*		for(int i=0, String a="cat";i<10;i++);   //i & a have different data types.Invalid*/
		
		int i=0;
		for(System.out.println("One");i<2;i++)
			System.out.println("Two");
		
/*		for(System.out.println("Good"); ;i++)   
			System.out.println("Morning");
		Output:- One time Good and Infinite times Morning will be printed.*/
		
		i=0;
		for(System.out.println("Happy");i<3;System.out.println("Diwali"))
			i++;
		
/*		for( ; ; )
			System.out.println("JAVA");
		Output:-Infinite times JAVA will be printed.*/
    }
}
/*Note:-All the 3 components of for loop are independent of each other & they are optional.*/
