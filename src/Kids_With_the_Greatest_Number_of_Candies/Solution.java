package Kids_With_the_Greatest_Number_of_Candies;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int max = 0;        //create max

        for (int i = 0; i < candies.length; i++) {
            max = Math.max(max, candies[i]);        // Find the maximum candies
        }

        List<Boolean> result = new ArrayList<Boolean>();       // create list

        for (int i = 0; i < candies.length; i++) {
            if (max <= candies[i] + extraCandies) {     // compare each kit with extraCandies
                result.add(true);
            } else
                result.add(false);
        }

        return result;      //returns results
    }
}
