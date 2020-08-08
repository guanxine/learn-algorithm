package cn.gx.learn.algorithm.stack;

import java.util.Stack;

public class No20 {

    public boolean isValid(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            }
            else {
                if (stack.isEmpty()) {
                    return false;
                }
                Character pop = stack.pop();

                if (pop != '(' && c == ')') {
                    return false;
                }

                if (pop != '[' && c == ']'){
                    return false;
                }
                if (pop != '{' && c == '}'){
                    return false;
                }
            }
        }
        if (stack.isEmpty()) {
            return true;
        }
        return false;
    }


    public boolean isValid_2(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()){
            if (c == '(') {
                stack.push(')');
            }
            else if (c == '[') {
                stack.push(']');

            }
            else if (c == '{'){
                stack.push('}');
            }
            else {
                if (stack.isEmpty() || stack.pop() != c) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {

    }
}
