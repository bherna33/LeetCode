package Remove_Duplicates_from_Sorted_Array;

public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0){      // checks if nums is empty
            return 0;       // return 0
        }
        int i = 0;      // index i
        for (int j = 1; j < nums.length; j++) {     // loop starting at index j
            if (nums[j] != nums[i]) {       //checks to see if nums_i != nums_j

                i++;        // iterate

                nums[i] = nums[j];      // set nums_i to nums_j
            }
        }
        return i + 1;       // return i plus 1 more.
    }
}
