
public class Palindrome_String_Check {
	public static String checkPalindrome(String word) {
		int length = word.length();
		for (int i = 0; i < length / 2; i++) {
			if (word.charAt(i) != word.charAt(length - i - 1)) {
				return "String is not Palindrome";
			}
		}
		return "String is Palindrome";
	}

	public static void main(String[] args) {
		String str = "maim";
		System.out.println(checkPalindrome(str));

	}
}
