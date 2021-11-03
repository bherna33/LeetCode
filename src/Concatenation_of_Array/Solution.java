package Concatenation_of_Array;

public class Solution {
    public int[] getConcatenation(int[] nums) {

        int[] concatenation = new int[2*nums.length];       // create array

        for(int i = 0; i < nums.length ; i++){      // run through array
            concatenation[i] = nums[i];     // add index to array
            concatenation[i+nums.length] = nums[i];     // add index + nums length to array
        }

        return concatenation;       // return array

    }
}
