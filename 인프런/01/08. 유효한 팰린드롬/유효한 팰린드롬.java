import java.util.Scanner;

public class Main {

    public String solution(String input) {
        String answer = "NO";
        input = input.toLowerCase().replaceAll("[^a-z]", "");

        StringBuilder sb = new StringBuilder(input);
        if (sb.reverse().toString().equals(input)) answer = "YES";

        return answer;
    }

    public static void main(String[] args) {
        Main m = new Main();
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        System.out.println(m.solution(input));
    }
}