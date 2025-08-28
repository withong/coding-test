import java.util.*;

public class Main {

    public String solution(String need, String plan) {
        String answer = "YES";
        Queue<Character> q = new LinkedList<>();

        for (char x : need.toCharArray()) {
            q.offer(x);
        }

        for (char x : plan.toCharArray()) {
            if (q.contains(x)) {
                if (x != q.poll()) return "NO";
            }
        }

        if (!q.isEmpty()) return "NO";

        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner in = new Scanner(System.in);

        String a = in.next();
        String b = in.next();

        System.out.println(main.solution(a, b));
    }
}