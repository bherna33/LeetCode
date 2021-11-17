package How_Many_Numbers_Are_Smaller_Than_the_Current_Number;

public class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] smaller = new int[nums.length];       // create array

        for(int i = 0; i< nums.length; i++){        // loop through array

            int k = 0;      // make count

            for(int j = 0; j < nums.length; j++){       //second pointer

                if(j != i && nums[j] < nums[i]){     // checks to see if j<i
                    k++;        //count if true
                    smaller[i] = k;     // add to array
                }
            }
        }
        return smaller;     // return array
    }
}
