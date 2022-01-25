package Single_Number;

public class Solution {
    public int singleNumber(int[] nums) {
        int current = nums[0];      //this assumes that the first element is the single number
        for(int i = 1; i < nums.length; i++){
            current = current ^ nums[i];        // compares to see if element is the same
        }
        return current;     //returns single number
    }
}
