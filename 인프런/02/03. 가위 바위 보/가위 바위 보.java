import java.util.Scanner;

public class Main {

    public char[] solution(int n, int[] a, int[] b) { // 1:가위, 2:바위, 3:보
        char[] answer = new char[n];

        for (int i = 0; i < n; i++) {
            if (a[i] == b[i]) answer[i] = 'D';
            else if (a[i] == 1 && b[i] == 2 || a[i] == 2 && b[i] == 3 || a[i] == 3 && b[i] == 1) answer[i] = 'B';
            else answer[i] = 'A';
        }

        return answer;
    }

    public static void main(String[] args) {
        Main m = new Main();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        for (int i = 0; i < n; i++) {
            b[i] = in.nextInt();
        }

        for (char c : m.solution(n, a, b)) {
            System.out.println(c);
        }
    }
}