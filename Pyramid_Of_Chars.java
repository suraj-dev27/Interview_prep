
public class Pyramid_Of_Chars {
	public static void main(String[] args) {
		char ch = 'a';

		/*
		 *      a
		 *     aa
		 *    aaa
		 *   aaaa
		 *  aaaaa
		 * aaaaaa
		 *  aaaaa
		 *   aaaa
		 *    aaa
		 *     aa
		 *      a
		 */ 
		 // Outer loop for Row 
		  for (int i = 0; i <= 5; i++) { 
		  // Inner loop for Column
		 for (int j = 0; j <= i; j++) { 
		  // to print character 
		  System.out.print(ch);
		  } 
		  // to move cursor to next line 
		  System.out.println(); 
		  }
		  
		  // Outer loop for Row 
		  for (int i = 0; i < 5; i++) { 
		  // Inner loop for Column
		  for (int j = 5; j > i; j--) { 
		  // to print character 
		  System.out.print(ch);
		  
		 } 
		 // to move cursor to next line 
		 System.out.println(); 
		 }
		 

		/*
		 *      a
		 *     aa
		 *    aaa
		 *   aaaa
		 *  aaaaa
		 * aaaaaa
		 * 
		 * // Outer loop for Row 
		 * for (int i = 0; i <= 5; i++) { 
		 * // 1st Inner loop for Column to print spaces before character 
		 * for (int j = 5 - i; j > 0; j--) {
		 * System.out.print(" "); 
		 * }
		 * 
		 * // 2nd Inner loop for Column to print character after spaces 
		 * for (int k = 0; k <= i; k++) { 
		 * System.out.print(ch); 
		 * } 
		 * System.out.println(); 
		 * }
		 */
		
		/*
		 * a
		 *  a
		 *   a
		 *    a
		 *     a
		 *      a
		 *     a
		 *    a
		 *   a
		 *  a
		 * a
		// Outer loop for no of Row 
		for(int i=0; i<=5; i++) {
			// Inner loop for no of Column
			for(int j=0; j<=i; j++) {
				//to print spaces before char
				System.out.print(" ");
			}
			//to print char at end
			System.out.println(ch);
		}
		
		// Outer loop for no of Row 
		for(int i=0; i<5; i++) {
			// Inner loop for no of Column
			for(int j=5-i; j>0; j--) {
				System.out.print(" ");
			}
			System.out.println(ch);
		}*/
		
		/*
		 * a                         a
		 *  a                       a
		 *   a                     a
		 *    a                   a
		 *     a                 a
		 *      a               a
		 *     a                 a
		 *    a                   a
		 *   a                     a
		 *  a                       a
		 * a                         a
		 * 
		// Outer loop for no of Row 
		for(int i=0; i<=5; i++) {
			// this is for left side
			// Inner loop for no of Column
			for(int j=0; j<=i; j++) {
				//to print spaces before char
				System.out.print(" ");
			}
			//to print char at left side
			System.out.print(ch);
			
			//to get space after char on each line
			for(int k =50-i; k>i; k--) {
				System.out.print(" ");
			}
			// to print char at right side
			System.out.println(ch);
		}
			
		// Outer loop for no of Row 
		for(int i=0; i<5; i++) {
			// this is for right side
			// Inner loop for no of Column
			for(int j=5-i; j>0; j--) {
				System.out.print(" ");
			}
			//to print char at left side
			System.out.print(ch);
			
			for(int k=41+i; k>=0-i; k--) {
				System.out.print(" ");
			}
			System.out.println(ch);
		}*/
		
		/*
		 *  aaaaaaa
		 *  aaaaaa
		 *  aaaaa
		 *  aaaa
		 *  aaa
		 *  aa
		 *  a
		 
		int row = 7;
		for(int i=row-1; i>=0; i--) {
			for(int j=0; j<=i; j++) {
				System.out.print(ch);
			}			
			System.out.println();
		}*/
		
		
		
		
		
		
		
		
		
	}
}
