import java.util.*;

public class Main {

    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (char x : s.toCharArray()) {
            if (x == ')') {
                while (stack.pop() != '(');
            } else {
                stack.push(x);
            }
        }

        for (char c : stack) {
            sb.append(c);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner in = new Scanner(System.in);

        String s = in.next();
        System.out.println(main.solution(s));
    }
}