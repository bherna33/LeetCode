package Valid_Anagram;

public class Solution {
    public boolean isAnagram(String s, String t) {
        //turn strings into arrays
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        //check to see if they are the same length of not return false
        if(a.length != b.length) return false;

        //sort array
        Arrays.sort(a);
        Arrays.sort(b);

        //loop and see if there is any difference. return false if indexes are not the same
        for(int i = 0; i < a.length; i++){
            if(a[i] != b[i]){
                return false;

            }
        }

        //return true if arrays are the same.
        return true;
    }
}
