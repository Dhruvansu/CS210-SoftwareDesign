//Dhruv Thakkar
//Anthony Russo

package HelloWorld.Dhruv;

public class Problem5 {

	public static void main(String[] args) {
		int[] array = { 14, 74, 62, 51, 18, 44, 77, 39, 99 };
		System.out.println(getSum(array));
		System.out.println(getAverage(array));
		System.out.println(getMax(array));
		System.out.println(getMin(array));

	}

	public static int getSum(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];

		}
		return sum;
	}

	public static double getAverage(int[] array) {
		double avg = 0.0;
		double total = getSum(array);
		avg = total / array.length;
		return avg;
	}

	public static int getMax(int[] array) {
		int max = 0;
		for (int x = 0; x < array.length; x++) {
			if (array[x] > max) {
				max = array[x];
			}
		}
		return max;
	}

	public static int getMin(int[] array) {
		int min = array[0];
		for (int y = 0; y < array.length; y++) {
			if (array[y] < min) {
				min = array[y];
			}
		}
		return min;
	}
}
