package leetcode.aaa_integers;

/**
 * Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
 *
 * Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
 *
 *
 *
 * Example 1:
 *
 * Input: x = 123
 * Output: 321
 * Example 2:
 *
 * Input: x = -123
 * Output: -321
 * Example 3:
 *
 * Input: x = 120
 * Output: 21
 *
 *
 * Constraints:
 *
 * -231 <= x <= 231 - 1
 */
public class AAC_ReverseInteger_7 {

    public static void main(String[] args) {
        AAC_ReverseInteger_7 reverseInteger = new AAC_ReverseInteger_7();
        System.out.println("Reverse 2147483647 = "+ reverseInteger.reverse(2147483647));
        System.out.println("Reverse -2147483648 = "+ reverseInteger.reverse(-2147483648));
        System.out.println("Reverse 123 = "+ reverseInteger.reverse(123));
        System.out.println("Reverse -123 = "+ reverseInteger.reverse(-123));
        System.out.println("Reverse 120 = "+ reverseInteger.reverse(120));
    }

    private int reverse(int x) {
        int reversed  = 0;
        while (x != 0) {
            int lastDigit = x%10;
            if((reversed > Integer.MAX_VALUE/10) || (reversed == Integer.MAX_VALUE/10 && lastDigit > 7)) {
                return 0;
            }
            if((reversed < Integer.MIN_VALUE/10) || (reversed == Integer.MIN_VALUE/10 && lastDigit < -8)) {
                return 0;
            }
            reversed = (reversed *10) + lastDigit;
            x = x/10;
        }
        return  reversed;
    }

}
