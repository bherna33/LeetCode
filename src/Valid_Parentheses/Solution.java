package Valid_Parentheses;

import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {

        if(s.length() % 2 !=0){     // if s is not divisible by 2 then it is not valid
            return false;
        }

        Stack<Character> stack =  new Stack();      // create empty stack

        for (char i:s.toCharArray()){       // run through each character in string
            if(i == '(' || i == '{' || i == '['){       // checks what the first char is
                stack.push(i);      // adds to stack
            }
            else if(i == ')' && !stack.isEmpty() && stack.peek() == '('){       // checks to see if i == char, stack is not empty, and if associated char is at the top
                stack.pop();        // clears top element.
            }
            else if(i == '}' && !stack.isEmpty() && stack.peek() == '{'){       // checks to see if i == char, stack is not empty, and if associated char is at the top
                stack.pop();        // clears top element.
            }
            else if(i == ']' && !stack.isEmpty() && stack.peek() == '['){       // checks to see if i == char, stack is not empty, and if associated char is at the top
                stack.pop();        // clears top element.
            }
            else{
                return false;
            }
        }
        return stack.isEmpty();     // return True
    }
}
