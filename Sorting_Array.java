import java.util.Arrays;

public class Sorting_Array {
	public static void main(String[] args) {
		int[] arr = { 20, 35, 41, 10, 7, 60, 55 };
		/*
		 * Arrays.sort(arr); System.out.println(Arrays.toString(arr));
		 */

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
