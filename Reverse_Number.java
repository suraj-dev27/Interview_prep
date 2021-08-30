
public class Reverse_Number {

public static int reverse(int num) {
	int reversed = 0;
    int digit;
    while(num != 0) {

         // get last digit from num
         digit = num % 10;
        
        // check if reversed num exceeds the int 32 bits limit
        if(reversed > Integer.MAX_VALUE/10 || reversed == Integer.MAX_VALUE/10 && digit > 7) return 0;
        if(reversed < Integer.MIN_VALUE/10 || reversed == Integer.MIN_VALUE/10 && digit < -8) return 0;
        
        reversed = reversed * 10 + digit;

        // remove the last digit from num
        num /= 10;
    }
   
    return reversed;
}
public static void main(String[] args){
System.out.println(reverse(153423646));
}
}
