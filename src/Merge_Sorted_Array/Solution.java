package Merge_Sorted_Array;

import java.util.Arrays;

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int counter = 0;
        for (int j = m; j <nums1.length ; j++) {
            if(counter == n){
                break;
            }
            int currentNumber = nums2[counter];
            nums1[j] = currentNumber;
            counter++;
        }

        Arrays.sort(nums1);
    }
}
