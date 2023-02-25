package Leetcode;

import java.util.Stack;

//Valid Parentheses - Easy
public class L20 {
    public boolean isValid(String s) {

        Stack<Character> charStack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == ')' && !charStack.isEmpty() && charStack.peek() == '('){
                charStack.pop();
            }else if(c == ']' && !charStack.isEmpty() && charStack.peek() == '['){
                charStack.pop();
            }else if(c == '}' && !charStack.isEmpty() && charStack.peek() == '{'){
                charStack.pop();
            }else{
                charStack.push(c);
            }
        }

        return charStack.isEmpty();
    }
    public static void main(String[] args) {
        L20 obj = new L20();
        obj.isValid("()[]{}");
    }
}
