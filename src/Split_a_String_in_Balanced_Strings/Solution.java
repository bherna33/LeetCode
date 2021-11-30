package Split_a_String_in_Balanced_Strings;

public class Solution {
    public int balancedStringSplit(String s) {
        int count = 0;      // count
        int bal = 0;        // substring count
        for(int i = 0; i < s.length(); i++){        // loops through String
            if(s.charAt(i) == 'L'){     // checks to see if char is L
                count++;        // increment count
            }
            else{
                count--;        // decrement count
            }
            if(count == 0){     // if count is 0 increment bal;
                bal++;
            }
        }
        return bal;     // return bal
    }
}
