import java.util.Stack;

class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();

        // Process string s
        for (char ch : s.toCharArray()) {
            if (ch == '#') {
                if (!stack1.isEmpty()) {
                    stack1.pop();
                }
            } else {
                stack1.push(ch);
            }
        }

        // Process string t
        for (char ch : t.toCharArray()) {
            if (ch == '#') {
                if (!stack2.isEmpty()) {
                    stack2.pop();
                }
            } else {
                stack2.push(ch);
            }
        }

        // Compare the final strings
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();

        while (!stack1.isEmpty()) {
            str1.append(stack1.pop());
        }

        while (!stack2.isEmpty()) {
            str2.append(stack2.pop());
        }

        return str1.toString().equals(str2.toString());
    }
}
