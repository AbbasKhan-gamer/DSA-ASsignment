// Name: Muhammad Abbas Babar Khan
// Roll Number: CSE/89/2K24

import java.util.Stack;

public class ParenthesesMatcher {
    public static void main(String[] args) {
        String expression = "{[()]}";
        System.out.println("Expression: " + expression);
        System.out.println("Is balanced: " + isBalanced(expression));
    }

    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();
        for (char ch : expression.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty() || !isMatchingPair(stack.pop(), ch)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') || 
               (open == '{' && close == '}') || 
               (open == '[' && close == ']');
    }
}
