package Reverse_Integer;

public class Solution {
    public int reverse(int x) {

        int reversed = 0;       // declare an integer

        while(x != 0){      // keep going till x == 0
            int pop = x % 10;     // return remainder which is last digit of number
            x /= 10;        // divide x by 10 to get off the last digit

            if(reversed > Integer.MAX_VALUE/10 || reversed == Integer.MAX_VALUE/10 && pop >7){      // checks to see if reversed is out of bounds
                return 0;       // returns 0 if out of bounds
            }
            if (reversed < Integer.MIN_VALUE/10 || reversed == Integer.MIN_VALUE/10 && pop <-8){    // checks to see if reversed is out of bounds
                return 0;       // returns 0 if out of bounds
            }

            reversed = (reversed * 10) + pop;      // multiply by 10 and add pop to number
        }
        return reversed;        // return reversed
    }
}
