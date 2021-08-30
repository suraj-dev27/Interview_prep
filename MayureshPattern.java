
public class MayureshPattern {

	/*
	 * 1
	 * 23
	 * 456
	 */
	 
	static int counter = 1;
	public static void main(String[] args) {
		for(int i=1; i<4; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(counter); // here it will print values on same line
				counter++;
			}
			System.out.println(); //this is to move pointer to new line after printing the whole line
		}
	}
}
