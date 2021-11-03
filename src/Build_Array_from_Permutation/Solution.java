package Build_Array_from_Permutation;

public class Solution {
    public int[] buildArray(int[] nums) {

        int[] permutation = new int[nums.length];       // create an empty array

        for(int i : nums){      // run through array
            permutation[i] = nums[nums[i]];     // add  nums_nums_i
        }
        return permutation;     // return permutation
    }
}
