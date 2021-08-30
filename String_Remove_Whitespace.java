
public class String_Remove_Whitespace {
	public static String removeWhitespace(String str) {
		StringBuilder sbr = new StringBuilder();
		char[] ch = str.toCharArray();
		for (char c : ch) {
			if (!(Character.isWhitespace(c))) {
				sbr.append(c);
			}
		}
		return sbr.toString();
	}

	public static void main(String[] args) {
		String str = "Hello Java";
		System.out.println(removeWhitespace(str));
	}
}
