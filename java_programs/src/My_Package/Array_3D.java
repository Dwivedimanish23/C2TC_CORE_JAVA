package My_Package;
public class Array_3D 
{
	public static void main(String[] args) 
	{
		byte [][][]x = {{{10,20,30},{40,5,60}},{{70,80},{90,100,110}}};
		System.out.println(x.length);
	/*length is a final variable applicable for arrays.
		It represents the length of the array.*/	
		
		System.out.println(x[0][1][2]);
		
		System.out.println(x[1][0][1]);
		
		System.out.println(x[1][1][1]);
		
		System.out.println(x[1][2][0]); //Array Index Out Of Bound Exception
		
		System.out.println(x[2][1][0]); //Array Index Out Of Bound Exception
	}
}
/*Note:- length method is a final method applicable for string objects.
  It represents no. of characters present in the string.*/