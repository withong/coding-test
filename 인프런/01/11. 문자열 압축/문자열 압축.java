import java.util.Scanner;

public class Main {

    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        s = s + " ";
        int count = 1;

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } else {
                sb.append(s.charAt(i));
                if (count > 1) {
                    sb.append(count);
                    count = 1;
                }
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Main m = new Main();
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        System.out.println(m.solution(input));
    }
}