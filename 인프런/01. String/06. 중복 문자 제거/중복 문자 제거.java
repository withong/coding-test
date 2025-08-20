import java.util.Scanner;

public class Main {

    public String solution(String input) {
        String answer = "";

        for (int i = 0; i < input.length(); i++) {
            if (i == input.indexOf(input.charAt(i))) {
                answer += input.charAt(i);
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