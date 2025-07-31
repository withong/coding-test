import java.util.Scanner;

public class Main {

    public String solution(int n, String s) {
        String answer = "";

        for (int i = 0; i < n; i++) {
            String t = s.substring(0, 7).replace('#', '1').replace('*', '0');
            int parsed = Integer.parseInt(t, 2);
            answer += (char) parsed;
            s = s.substring(7);
        }

        return answer;
    }

    public static void main(String[] args) {
        Main m = new Main();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();

        System.out.println(m.solution(n, s));
    }
}