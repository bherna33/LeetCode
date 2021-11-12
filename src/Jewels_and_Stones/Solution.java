package Jewels_and_Stones;

public class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int total = 0;      // create total

        for(int i = 0; i < jewels.length(); i++){       // run through jewels
            for(int j = 0; j < stones.length(); j++){       // run through stones
                if(jewels.charAt(i) == stones.charAt(j)){       // checks to see if the index is the same
                    total++;        // adds to total
                }
            }
        }
        return total;       // return total
    }
}
