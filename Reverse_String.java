
public class Reverse_String {

	public static String reverse(String str) {
		if (str == null) {
			throw new IllegalArgumentException("null is not valid input");
		}
		StringBuilder br = new StringBuilder();

		char[] ch = str.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			br.append(ch[i]);
		}
		return br.toString();
	}

	public static void main(String[] args) {
		String str = "suraj";
		System.out.println(reverse(str));
	}
}
