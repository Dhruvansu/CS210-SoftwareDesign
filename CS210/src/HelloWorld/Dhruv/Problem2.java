//Dhruv Thakkar

package HelloWorld.Dhruv;
import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the event name:");
		String show = obj.nextLine();
		System.out.println("Enter the event length in number of minutes:");
		int slength = obj.nextInt();
		int temp = slength;
		int day = temp / (24*60);
		temp = temp - (24*60*day);
		int hour = temp / 60;
		temp = temp - (60*hour);
		int mins = temp;
		
		System.out.println(show + " lasting " + slength + " minutes is equal to " + day + " days and " + hour + " hours "+ mins + " minutes.");
		
		
	}

}
