package Contains_Duplicate;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);      //sort the array
        for(int i =1; i< nums.length; i++){     //loop through array starting from the second array
            if(nums[i] == nums[i-1]){       // compare the ith and the i-1 element
                return true;        //returns true if same
            }
        }
        return false;       //return false otherwise
    }
}
