package leetcode.aaa_integers;

public class SingleNumber {

    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        System.out.println(""+singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        int answer = nums[0];
        for(int i=1; i< nums.length; i++) {
            answer = answer ^nums[i];
        }
        return answer;
    }

}