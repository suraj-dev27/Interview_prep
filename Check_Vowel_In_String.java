
public class Check_Vowel_In_String {
	public static boolean checkVowel(String str) {
		return str.toLowerCase().matches(".*[aeiou].*");
	}

	public static void main(String[] args) {
		String str = "Hll";
		System.out.println(checkVowel(str));
	}
}
