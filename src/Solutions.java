import java.util.*;

public class Solutions {

    // Question 1
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();    // Make a empty map

        for (int i = 0; i < nums.length; i++){          // loop though array
            if(map.containsKey(target-nums[i])){        // checks to see if key exist
                return new int[] {i,map.get(target - nums[i])};     // if key exist, returns i and value from map
            }
            map.put(nums[i], i);        // if key doesn't exist it puts it in the map.
        }
        return new int[0];      // returns 0
    }

    // Question 7
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

    // Question 9
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

    // Question 13
    public int romanToInt(String s) {
        int num = 0;

        for (int i = s.length() - 1; i >= 0; i--){
            String c = s.charAt(i)+"";
            char prev = i+1<s.length() ? s.charAt(i+1):'*';

            if(c.equals("I")){
                num += 1;
                if(prev == 'V'){
                    num-=2;
                }
                if(prev == 'X'){
                    num-=2;
                }
            }
            else if(c.equals("V")){
                num += 5;
            }
            else if(c.equals("X")){
                num += 10;
                if(prev == 'L'){
                    num-=20;
                }
                if(prev == 'C'){
                    num-=20;
                }
            }
            else if(c.equals("L")){
                num += 50;
            }
            else if(c.equals("C")){
                num += 100;
                if(prev == 'D'){
                    num-=200;
                }
                if(prev == 'M'){
                    num-=200;
                }
            }
            else if(c.equals("D")){
                num += 500;
            }
            else if(c.equals("M")){
                num += 1000;
            }
        }
        return num;
    }

    // Question 14
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

    // Question 20
    public boolean isValid(String s) {

        if(s.length() % 2 !=0){
            return false;
        }

        Stack<Character> stack =  new Stack();

        for (char i:s.toCharArray()){
            if(i == '(' || i == '{' || i == '['){
                stack.push(i);
            }
            else if(i == ')' && !stack.isEmpty() && stack.peek() == '('){
                stack.pop();
            }
            else if(i == '}' && !stack.isEmpty() && stack.peek() == '{'){
                stack.pop();
            }
            else if(i == ']' && !stack.isEmpty() && stack.peek() == '['){
                stack.pop();
            }
            else{
                return false;
            }
        }
        return stack.isEmpty();
    }

    // Question 26
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0){
            return 0;
        }
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
