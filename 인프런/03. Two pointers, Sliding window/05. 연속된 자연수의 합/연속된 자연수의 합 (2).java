import java.util.Scanner;

public class Main {

    public int solution(int n) {
        int answer = 0;
        int count = 1;
        n--;

        while (n > 0) {
            count++;
            n -= count;
            if (n % count == 0) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        System.out.println(main.solution(n));
    }
}