package Palindrome_Number;

public class Solution {
    public boolean isPalindrome(int x) {
        String reversed = Integer.toString(x);     // turns x into String

        int i =0;       //index
        int j = reversed.length() -1;      //index

        while (i<j){
            if (reversed.charAt(i) != reversed.charAt(j)){        //if reversed is not the same char it returns false
                return false;
            }
            i++;        // iterate up
            j--;        // iterate down
        }
        return true;
    }
}
