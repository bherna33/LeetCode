package Palindrome_Number;

public class Solution {
    public boolean isPalindrome(int x) {
        String reveresed = Integer.toString(x);     // turns x into String

        int i =0;       //index
        int j = reveresed.length() -1;      //index

        while (i<j){
            if (reveresed.charAt(i) != reveresed.charAt(j)){        //if reversed is not the same char it returns false
                return false;
            }
            i++;        // iterate up
            j--;        // iterate down
        }
        return true;
    }
}
