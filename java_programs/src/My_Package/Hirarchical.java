package My_Package;
class A {
	public void print_A() { System.out.println("Prathamesh"); }
}

class B extends A {
	public void print_B() { System.out.println("Gaikar"); }
}

class C extends A {
	public void print_C() { System.out.println("Badlapur"); }
}


public class Hirarchical {
	public static void main(String[] args)
	{
		B h= new B();
		h.print_A();
		h.print_B();

		C g = new C();
		g.print_A();
		g.print_C();

		
	}
}
