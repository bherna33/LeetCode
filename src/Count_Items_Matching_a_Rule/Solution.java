package Count_Items_Matching_a_Rule;

import java.util.List;

public class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;      // count

        int index;      // index

        // checks to see what ruleKey to use
        if(ruleKey.equals("type")){
            index = 0;
        }
        else if(ruleKey.equals("color")){
            index = 1;
        }
        else{
            index = 2;
        }

        for (int i = 0; i < items.size(); i++) {        // loop through list
            if (items.get(i).get(index).equals(ruleValue)) {        // checks if list[list[i]] == ruleValue
                count++;        // increment
            }
        }
        return count;       // return count
    }
}
