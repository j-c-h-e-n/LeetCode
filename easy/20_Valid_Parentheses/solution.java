import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();

        for (char c : s.toCharArray()){
            if (c == '(')  
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                // if stack if empty, that means no opening brackets were added
                // if the top character isn't equal to c, then it wasn't a proper closed bracket
                return false;
        }

        return stack.isEmpty();
    }
}