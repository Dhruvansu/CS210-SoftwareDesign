//Dhruv Thakkar

package HelloWorld.Dhruv;
/*
 * This class exercises functions and decision statements
 */

public class Problem3 {

	public static void main(String[] args){
		printGrade(2);
		dessertType("apple");
	}
	
	// Modify this function so that it uses a switch statement
	public static void printGrade(int semesters){
		switch(semesters) {
			case 1:
			case 2:
				System.out.println("Freshman");
				break;
			case 3:
			case 4:
				System.out.println("Sophomore");
				break;
			case 5:
			case 6:
				System.out.println("Juniors");
				break;
			case 7:
			case 8:
				System.out.println("Senior");
			default:
				System.out.println("Incorrect semester number!");
		}
	}
		
	
	
	// Modify this function so that it uses an if-else block
	public static void dessertType(String food){
		if (food == "apple" || food == "orange" || food == "pineappple") {
				System.out.println("Healthy!");
		}
		else if (food == "pie" || food == "cookies") {
				System.out.println("Less Healthy!");
		}
		else if (food == "creme brulee" || food == "baked alaska") {
				System.out.println("Decaden!");
		}
		else {
			System.out.println("Not a dessert.");
		}
			
	}
		
	
	}
