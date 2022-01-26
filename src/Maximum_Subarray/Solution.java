package Maximum_Subarray;

public class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;        // set max to the lowest possible int
        int sum = 0;        // set sum to 0
        for(int i = 0; i < nums.length; i++){       // loop through array
            sum += nums[i];     // add sum up
            max = Math.max(max, sum);       // take the max of the two

            if(sum < 0){        // when adding, if sum becomes less than 0 we would set it to 0
                sum = 0;
            }
        }
        return max;     // return max
    }
}
