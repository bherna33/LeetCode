package Running_Sum_of_1d_Array;

public class Solution {
    public int[] runningSum(int[] nums) {

        int [] ans = new int[nums.length];      // create array

        int sums = 0;       // create sums

        for(int i = 0; i < nums.length; i++){   // loop through array
            sums = sums + nums[i];      // current sums + nums_i
            ans[i] = sums;      // add sums to array
        }

        return ans;     // return array
    }
}
