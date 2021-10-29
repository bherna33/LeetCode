package Longest_Common_Prefix;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
          /*
             get first letter of first index
             compare the first letter of the first index to the first letter of the second index
             compare first ltter in first index to the first letter to the nth index
             if all index share the first letter add to a empty string
                continue to add till no common char
             else return empty string
             */

        String result = "";

        for (int i = 0; i< strs[0].length(); i++){
            String test = strs[0].charAt(i) + "";
            for(int j = 1; j<strs.length; j++){
                if( strs[j].length() == i || !test.equals(strs[j].charAt(i)+ "")){
                    return result;
                }
            }
            result+= test;
        }

        return result;
    }
}
