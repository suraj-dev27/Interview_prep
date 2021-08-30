
public class Sum_Of_All_Ele_Of_Array {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
		int sum = 0;
		for (int num : arr) {
			sum += num;
		}
		System.out.println(sum);
	}
}
