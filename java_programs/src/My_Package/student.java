package My_Package;
public class student 
{
	String name;
	int roll, age;

	public student(String name, int roll, int age) 
	{
		this.name = name;
		this.roll = roll;
		this.age = age;
	}
	public static void main(String[] args) 
	{
		student s1 = new student("Pratham",1,21);
		student s2 = new student("Manish",2,45);
		
		System.out.println(s1.name+" "+ s1.roll+" "+ s1.age);
		System.out.println(s2.name+" "+ s2.roll+" "+ s2.age);
	}
}
