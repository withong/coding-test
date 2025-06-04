import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        String answer = solution(input);
        System.out.println(answer);
    }

    public static String solution(String input) {
        StringBuilder sb = new StringBuilder();

        for (char c : input.toCharArray()) {
            String str = sb.toString();
            if (!str.contains(String.valueOf(c))) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
