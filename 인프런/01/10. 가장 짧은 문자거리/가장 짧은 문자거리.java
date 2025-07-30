import java.util.Scanner;

public class Main {

    public int[] solution(String s, char c) {
        int[] answer = new int[s.length()];

        int d = 100;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                d = 0;
                answer[i] = d;
            } else {
                d++;
                answer[i] = d;
            }
        }

        d = 100;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == c) {
                d = 0;
            } else {
                d++;
                answer[i] = Math.min(answer[i], d);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main m = new Main();
        Scanner in = new Scanner(System.in);
        String input = in.next();
        char c = in.next().charAt(0);

        for (int i : m.solution(input, c)) {
            System.out.print(i + " ");
        }
    }
}