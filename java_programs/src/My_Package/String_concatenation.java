package My_Package;
public class String_concatenation {

	public static void main(String[] args) {
		String s = new String("    Prathamesh Narayan Gaikar");//immutable object
		s.concat("The Great"); //concat method for concatenation in String class
		//String class objects are immutable
		System.out.println(s);
		
		StringBuffer sb = new StringBuffer("ABCD");//mutable object
		sb.append(" EFGH"); //append method for concatenation in StringBuffer class
		//StringBuffer class objects are mutable
		System.out.println(sb);
		 
		
		String a = "Java";
		int b=10, c=20, d=30;
		System.out.println(a+b+c+d);
		System.out.println(b+c+d+a);
		System.out.println(b+c+a+d);
		System.out.println(b+a+c+d);
	
	
	}

}
