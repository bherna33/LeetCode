package Final_Value_of_Variable_After_Performing_Operations;

public class Solution {
    public int finalValueAfterOperations(String[] operations) {

        int count = 0;      // set count to 0

        for(String i : operations){     // loops through array
            if(i.equals("X++") || i.equals("++X")){     //checks to see if index equals strings
                count++;        // increment count
            }
            else{
                count--;        // decrement count
            }
        }
        return count;       // returns count
    }
}
