package My_Package;
public class Method_Overloading {
	/*public void m(Object o)
	{
	  System.out.println("Object Class");
	}*/
	public void m(StringBuffer b)
	{
		  System.out.println("StringBuffer Class");
		}
	/*public void m(String s)
	{
		System.out.println("String Class");
	}*/
	public static void main(String[] args) {
		Method_Overloading obj = new Method_Overloading();
		/*obj.m(null);
		obj.m(new Object());
		obj.m(8);
		obj.m(5.6);
		obj.m(4l);
		obj.m(8.26f);*/
		obj.m(new StringBuffer("ABCD"));
		
	}
}
