package Number_of_Good_Pairs;

public class Solution {
    public int numIdenticalPairs(int[] nums) {
        int pairs = 0;      // count pairs
        for(int i = 0; i< nums.length; i++){        // loop through array and compare i and j
            for(int j = 1; j < nums.length; j++){
                if(i< j && nums[i] == nums[j]){
                    pairs++;        // increment
                }
            }
        }
        return pairs;       // return pairs
    }
}
