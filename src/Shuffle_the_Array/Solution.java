package Shuffle_the_Array;

public class Solution {
    public int[] shuffle(int[] nums, int n) {

        int[] shuffle = new int[nums.length];       // create array

        int j = 0;      // index j
        for(int i = 0; i < nums.length; i++){       // run through array
            if( i % 2 == 0){        // checks to see if the i is even
                shuffle[i] = nums[j];       // adds index to array
                ++j;        //pre-increment j
            }
            else{
                shuffle[i] = nums[n];       // adds odd index to array starting from n
                ++n;        // pre-increment n
            }
        }
        return shuffle;     // return shuffle.
    }
}
