package My_Package;
public class String_java {
	public static void main(String[] args) 
	{
		String s = new String("    Prathamesh Narayan Gaikar"); 
		
		System.out.println(s);		
		
		System.out.println(s.length());
		
		System.out.println(s.toLowerCase());
		
		String upper = s.toUpperCase();
		 System.out.println(upper);
		 
		String s1 = "MUMBAI";
		String s2 = "HELLO";
		String s3 = "Day By Day";
		 System.out.println(s1.equals("mumbai"));
		 
		 System.out.println(s1.equalsIgnoreCase("mumbai"));
		 
		 System.out.println(s1.replace('M','T'));
		 System.out.println(s1);
		 
		 System.out.println(s.trim());
		 
		 System.out.println(s.substring(3));
		 
		 System.out.println(s.substring(4,11));
		 
		 System.out.println(s.charAt(15));//Returns the character at ith index.
		 
		 System.out.println(s2.concat(s1));// Concatenates specified string to the end of this string.
		 System.out.println(s1);
		 System.out.println(s2);
		 //The original string is not changed because String class objects are immutable.
		 
		 System.out.println(s3.indexOf("Day"));//Returns the index within the string of the first occurrence of the specified string.
		 
		 System.out.println(s3.indexOf("ay",2));//Returns the index within the string of the first occurrence of the specified string, starting search at the specified index.

		 System.out.println(s3.lastIndexOf("b"));//Returns the index within the string of the last occurrence of the specified string.
		 
		 System.out.println(s1.compareTo(s2));//Compares two string lexicographically
		 System.out.println(s1.compareToIgnoreCase(s2));//Compares two string lexicographically, ignoring case considerations.
		  
		
	}

}
