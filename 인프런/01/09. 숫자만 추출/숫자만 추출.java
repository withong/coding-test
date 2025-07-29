import java.util.Scanner;

public class Main {

    public int solution(String input) {
        int answer = 0;

        for (char c : input.toCharArray()) {
            if (c >= '0' && c <= '9') {
                answer = answer * 10 + (c - '0');
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main m = new Main();
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        System.out.println(m.solution(input));
    }
}