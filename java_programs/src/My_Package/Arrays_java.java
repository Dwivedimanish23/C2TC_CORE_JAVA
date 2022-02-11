package My_Package;
public class Arrays_java {

	public static void main(String[] args) 
	{
    int  [][][]x = {{{10,20,30},{40,50,60}},{{120,127}},{{70,80},{90,100,110}}};
     System.out.println(x[1][0][0]);
     System.out.println(x[1][1][1]); //Index 1 out of bounds for length 1
	}

}
