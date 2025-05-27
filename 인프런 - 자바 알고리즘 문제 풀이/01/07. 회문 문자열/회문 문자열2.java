import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        String answer = solution(input);
        System.out.println(answer);
    }

    public static String solution(String input) {
        StringBuilder sb = new StringBuilder(input);

        String reverse = sb.reverse().toString();

        return input.equalsIgnoreCase(reverse) ? "YES" : "NO";
    }
}