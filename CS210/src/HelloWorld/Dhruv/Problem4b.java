//Dhruv Thakkar

package HelloWorld.Dhruv;
import java.util.Scanner;

public class Problem4b {

	public static void main(String[] args) {
		char cont = 'n';
		while (cont == 'n') {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a integer:");
		int number = obj.nextInt();
		if (isEven(number)) {
			System.out.println(number + " is an even number");
			System.out.println("Done (y/n)? ");
			char ans = obj.next().charAt(0);
			cont = ans;
		}
		else {
			System.out.println(number + " is an odd number");
			System.out.println("Done (y/n)? ");
			char ans = obj.next().charAt(0);
			cont = ans;
		}
		
	}

	}
	
	public static boolean isEven(int number) {
		if (number % 2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}

}
