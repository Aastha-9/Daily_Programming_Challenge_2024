import java.util.Stack;
public class CheckParenthesesDay12 {
    public boolean check(String str) {
        Stack<Character> stk = new Stack<>();
        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stk.push(ch);
            } else {
                if (stk.isEmpty()) return false;
                char top = stk.pop();
                if (ch == ')' && top != '(') return false;
                if (ch == '}' && top != '{') return false;
                if (ch == ']' && top != '[') return false;
            }
        }
        return stk.isEmpty();
    }
    public static void main(String[] args) {
        CheckParenthesesDay12 cp = new CheckParenthesesDay12();
        System.out.println(cp.check("[{()}]"));
    }
}
