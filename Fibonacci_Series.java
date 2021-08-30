
public class Fibonacci_Series {
	// fibonacci series using recursion
	/*
	 * public static int fibonacci(int n) { if (n <= 1) return n; return fibonacci(n
	 * - 1) + fibonacci(n - 2); }
	 */

	public static void main(String[] args) {
		// normal way to print fibonacci series
		int a = 0, b = 1, c = 1;
		int n = 5;
		for (int i = 1; i <= n; i++) {
			System.out.print(a + " ");
			a = b;
			b = c;
			c = a + b;
		}

		// fibonacci series using recursion
		// System.out.println(fibonacci(n));
	}
}
