import java.util.*;

public class Main {

    public int[] solution(int s, int n, int[] arr) {
        int[] cache = new int[s];

        for (int x : arr) {
            int pos = -1;

            for (int i = 0; i < s; i++) {
                if (x == cache[i]) {
                    pos = i;
                    break;
                }
            }

            if (pos == -1) {
                for (int i = s - 1; i >= 1; i--) {
                    cache[i] = cache[i - 1];
                }
            } else {
                for (int i = pos; i >= 1; i--) {
                    cache[i] = cache[i - 1];
                }
            }

            cache[0] = x;
        }

        return cache;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner in = new Scanner(System.in);

        int s = in.nextInt();
        int n = in.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        for (int x : main.solution(s, n, arr)) {
            System.out.print(x + " ");
        }
    }
}