import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedParanthesis {

	static boolean arrBracketsBalanced(String expr) {
		// using ArrayDeque bcoz it is faster than Stack
		Deque<Character> stack = new ArrayDeque<Character>();

		for (int i = 0; i < expr.length(); i++) {
			char x = expr.charAt(i);

			if (x == '{' || x == '[' || x == '(') {
				stack.push(x);
				continue;
			}

			// if current char is not opening bracket then it must be closing. So stack
			// cannot be empty at this point
			if (stack.isEmpty())
				return false;

			char check;
			switch (x) {
			case ')':
				check = stack.pop();
				if (check == '{' || check == '[')
					return false;
				break;

			case '}':
				check = stack.pop();
				if (check == '(' || check == '[')
					return false;
				break;

			case ']':
				check = stack.pop();
				if (check == '{' || check == '(')
					return false;
				break;
			}
		}
		return stack.isEmpty();
	}

	public static void main(String[] args) {
		String expr = "{[()]}";
		if (arrBracketsBalanced(expr)) {
			System.out.println("Balanced");
		} else {
			System.out.println("Not Balanced");
		}

	}

}
