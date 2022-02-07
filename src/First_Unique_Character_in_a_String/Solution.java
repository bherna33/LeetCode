package First_Unique_Character_in_a_String;

public class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();      // create hashmap

        for(char i : s.toCharArray()){
            map.put(i, map.getOrDefault(i, 0) + 1);     //add elements to map and count its instance
        }
        for(int i = 0; i < s.length(); i++) {
            if(map.containsKey(s.charAt(i)) && map.get(s.charAt(i)) == 1){      //check to see if key exist and equals 1
                return i;       // return the index
            }
        }
        return -1;      // return -1 if it doesn't exist
    }
}
