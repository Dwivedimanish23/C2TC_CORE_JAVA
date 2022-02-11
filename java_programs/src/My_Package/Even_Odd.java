package My_Package;
import java.util.Scanner;

public class Even_Odd 
{
	public static void main(String[] args) {
		int num;
		System.out.println("Enter the number");
		Scanner input = new Scanner(System.in); //Reading from keyboard
				num = input.nextInt();
        if (num % 2 == 0)
            System.out.println("Entered Number is Even");
        else         
            System.out.println("Entered Number is Odd");
	}
}
