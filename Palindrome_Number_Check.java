
public class Palindrome_Number_Check {
	
	public static boolean isPalindrome(int x) {
		String y=Integer.toString(x);
		y=new StringBuilder(y).reverse().toString();
		if(Integer.toString(x).equals(y))
		{
			return true;
		}
		return false;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome(2));
	}

}
