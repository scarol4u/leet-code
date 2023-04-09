package leetcode.aaa_integers;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an integer n, return a string array answer (1-indexed) where:
 * <p>
 * answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
 * answer[i] == "Fizz" if i is divisible by 3.
 * answer[i] == "Buzz" if i is divisible by 5.
 * answer[i] == i (as a string) if none of the above conditions are true.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: n = 3
 * Output: ["1","2","Fizz"]
 * Example 2:
 * <p>
 * Input: n = 5
 * Output: ["1","2","Fizz","4","Buzz"]
 * Example 3:
 * <p>
 * Input: n = 15
 * Output: ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= n <= 104
 */
public class AAA_FizzBuzz_412 {

    public static void main(String[] args) {
        List<String> fizzBuzzList = new AAA_FizzBuzz_412().fizzBuzz(20);
        fizzBuzzList.stream()
                .forEach(System.out::println);
    }

    public List<String> fizzBuzz(int n) {
        List<String> fizzBuzzList = new ArrayList<>();
        for(int i=1; i<=n; i++) {
            if(i%15 == 0) {
                fizzBuzzList.add("FizzBuzz");
            } else if(i%3 == 0) {
                fizzBuzzList.add("Fizz");
            } else if(i%5 == 0){
                fizzBuzzList.add("Buzz");
            } else {
                fizzBuzzList.add(Integer.toString(i));
            }
        }
        return fizzBuzzList;
    }

}
