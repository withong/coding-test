import java.util.*;

public class Main {

    public int solution(String s) {
        Stack<Integer> stack = new Stack<>();

        for (char x : s.toCharArray()) {
            if (Character.isDigit(x)) {
                stack.push(x - '0');
            } else {
                int rt = stack.pop();
                int lt = stack.pop();

                if (x == '+') {
                    stack.push(lt + rt);
                } else if (x == '-') {
                    stack.push(lt - rt);
                } else if (x == '*') {
                    stack.push(lt * rt);
                } else if (x == '/') {
                    stack.push(lt / rt);
                }
            }
        }

        return stack.peek();
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner in = new Scanner(System.in);

        String s = in.next();
        System.out.println(main.solution(s));
    }
}