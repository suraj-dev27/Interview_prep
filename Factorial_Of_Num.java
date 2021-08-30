
public class Factorial_Of_Num {

	/*
	 * public static int findFactorial(int n) {
	 * 
	 * int temp = n; for (int i = 1; i < n; i++) { temp *= i;
	 * 
	 * } return temp; }
	 */

	public static int factorial(int n) {
		if (n <= 0) {
			return -1;
		} else if (n == 1) {
			return 1;
		} else {
			return (n * factorial(n - 1));
		}
	}

	public static void main(String[] args) {
		// System.out.print(findFactorial(5));
		int temp = factorial(5);
		if (temp == -1) {
			System.out.println("Please enter valid number!");
		} else {
			System.out.println(temp);
		}
	}
}
