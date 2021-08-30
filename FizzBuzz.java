
public class FizzBuzz {

	public static void main(String[] args) {
		
		int[] arr = {15,26,4,5,33,7,8};
		for (int i=0; i< arr.length; i++) {
			if(arr[i]%3==0 && arr[i]%5==0) {
				System.out.println(i+" FizzBuzz");
			}else if (arr[i]%3==0) {
				System.out.println(i+" Fizz");
			}else if (arr[i]%5==0) {
				System.out.println(i+" Buzz");
			}else {
				System.out.println(i+" "+arr[i]);
			}
		}
	}
}
