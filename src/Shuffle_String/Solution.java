package Shuffle_String;

public class Solution {
    public String restoreString(String s, int[] indices) {

        char [] arr = new char[s.length()];     // create an Array of same size of String

        for(int i=0; i<s.length(); i++){        // Iterate over the String
            arr[indices[i]] = s.charAt(i);      // Store every Character at a Required Place in arr Array
        }

        String result = "";     // Now Create an Empty String

        for(char element: arr)      // Concatenate Every Element of character Array arr with Empty String
            result += element;

        return result;      // return results
    }
}
