package stack;

import java.util.Stack;

public class validParenthesis {
    public boolean isValid(String s) {
        // '(' must be closed by this ')'
        // '{' must be closed by this '}' but can also take '()' in  between
        // '[' must be closed by this ']' but can also take '()' and "{}" in between
        // {[()]}
        //stack: <     >
        Stack<Character> openingBrackets = new Stack<>();
        for (int i = 0;i<s.length();i++){
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                openingBrackets.push(s.charAt(i));
            }
            else{
                // if stack not empty:
                // if character is a closing bracket then top of stack must contain its corresponding
                // opening bracket, if not we return false.
                // if stack is empty: return false
                if (openingBrackets.isEmpty()){
                    return false;
                }else{
                    if (s.charAt(i) == ')' && openingBrackets.peek() == '('){
                        openingBrackets.pop();
                    }
                    else if (s.charAt(i) == ')' && openingBrackets.peek() != '('){
                        return false;
                    }

                    else if (s.charAt(i) == '}' && openingBrackets.peek() == '{'){
                        openingBrackets.pop();
                    }
                    else if (s.charAt(i) == '}' && openingBrackets.peek() != '{'){
                        return false;
                    }

                    else if (s.charAt(i) == ']' && openingBrackets.peek() == '['){
                        openingBrackets.pop();
                    }
                    else if (s.charAt(i) == ']' && openingBrackets.peek() != '['){
                        return false;
                    }
                }

            }
        }
        return openingBrackets.isEmpty();
    }
}
