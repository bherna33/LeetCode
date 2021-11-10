package Search_Insert_Position;

public class Solution {
    public int searchInsert(int[] nums, int target) {
        int val = 0;        // tracker
        for(int i = 0; i < nums.length; i++){       // run through array
            if(target == nums[i]){      // checks to see if target is in array
                return i;       // returns index
            }
            if (nums[i] < target){      // compares nums_i with target
                val++;      // increment val
            }
        }
        return val;     //return val
    }
}
