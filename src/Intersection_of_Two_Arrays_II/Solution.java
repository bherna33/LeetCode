package Intersection_of_Two_Arrays_II;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] map = new int[1001];      //Create array equal to constant space

        for(int i:nums1) {      //count frequency of each number of num1 in map
            map[i]++;
        }

        List<Integer> list = new ArrayList<>();     // create a list array to store values

        for(int i:nums2) {      //check if num2 is in map if yes add it into list.
            if(map[i]!=0) {
                map[i]--;
                list.add(i);
            }
        }

        int[] intersection = new int[list.size()];      //since we want array output. convert back list to array

        for(int i=0;i<list.size();i++) {
            intersection[i]=list.get(i);        // add to array
        }
        return intersection;        //return array
    }
}
