package LeeCode.String;

import java.util.Stack;
/**
 * LC 20  有效的括号
 * Input: s = "()[]{}"
 * Output: true
 */
public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("()[]{}"));
    }
    /**
     * 栈 Stack
     * 先进后出
     */
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');    //入栈
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.empty() || c != stack.pop())  //出栈
                return false;
        }
        return stack.empty();
    }
}