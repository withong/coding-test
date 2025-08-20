import java.util.Scanner;

public class Main {

    public int[] solution(int n, int[] arr) {
        int answer[] = new int[n];

        for (int i = 0; i < n; i++) {
            int score = 1;
            for (int j = 0; j < n; j++) {
                if (arr[j] > arr[i]) score++;
            }
            answer[i] = score;
        }

        return answer;
    }

    public static void main(String[] args) {
        Main m = new Main();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        for (int i : m.solution(n, arr)) {
            System.out.print(i + " ");
        }
    }
}