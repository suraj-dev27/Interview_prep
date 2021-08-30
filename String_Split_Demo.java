
public class String_Split_Demo {

	public static void main(String[] args) {
		System.out.println("======================================");
		System.out.println("\nNormal String REGEX\n");
		System.out.println("======================================");
		
		String str = "Hello@World@This@Is@A@Jav@Program";
		
		System.out.println("Positive Lookahead ==>>\n");
		String[] splits1 = str.split("(?=@)");
		for (String string : splits1) {
			System.out.println(string);			
		}
		
		System.out.println("======================================");
		
		System.out.println("Positive Lookbehind ==>>\n");
		String[] splits2 = str.split("((?<=@))");
		for (String string : splits2) {
			System.out.println(string);			
		}
		
		System.out.println("======================================");
		
		System.out.println("Positive Lookahead | Lookbehind ==>>\n");
		String[] splits3 = str.split("((?=@)|(?<=@))");
		for (String string : splits3) {
			System.out.println(string);			
		}

		//------------------------------------------------------------------------------------------------------------------
		System.out.println("======================================");
		System.out.println("\nMixed String REGEX\n");
		System.out.println("======================================");
		
		String mixedStr = "@HelloWorld@This:Is@A#Jav#Program";
		
		System.out.println("Positive Lookahead ==>>\n");
		String[] split1 = mixedStr.split("((?=@|:|#))");
		for (String string : split1) {
			System.out.println(string);			
		}
		
		System.out.println("======================================");
		
		System.out.println("Positive Lookbehind ==>>\n");
		String[] split2 = mixedStr.split("((?<=@|:|#))");
		for (String string : split2) {
			System.out.println(string);			
		}
		
		System.out.println("======================================");
		
		System.out.println("Positive Lookahead | Lookbehind ==>>\n");
		String[] split3 = mixedStr.split("((?=@|:|#)|(?<=@|:|#))");
		for (String string : split3) {
			System.out.println(string);			
		}
	}

}
