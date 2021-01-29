//Dhruv Thakkar

package HelloWorld.Dhruv;
import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a integer:");
		int number = obj.nextInt();
		if (isEven(number)) {
			System.out.println(number + " is an even number");
		}
		else {
			System.out.println(number + " is an odd number");
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
