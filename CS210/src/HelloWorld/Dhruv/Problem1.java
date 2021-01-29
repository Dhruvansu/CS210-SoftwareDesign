//Dhruv Thakkar

package HelloWorld.Dhruv;
import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter your name:");
		String name = obj.nextLine();
		System.out.println("Enter your age:");
		int age = obj.nextInt();
		System.out.println("Enter your pay:");
		double hpay = obj.nextDouble();
		System.out.println("Enter your hours worked:");
		int hworked = obj.nextInt();
		
		System.out.println("My name is " + name + ", my age is " + age + ", and my pay is $" + hpay + " per hour.");
	}

}
