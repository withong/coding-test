import java.util.Scanner;

public class Main {

    public int solution(int n, int m, int[] arr) {
        int answer;
        int sum = 0;

        for (int i = 0; i < m; i++) {
            sum += arr[i];
        }

        answer = sum;

        for (int i = m; i < n; i++) {
            sum += (arr[i] - arr[i - m]);
            answer = Math.max(answer, sum);
        }

        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(main.solution(n, m, arr));
    }
}