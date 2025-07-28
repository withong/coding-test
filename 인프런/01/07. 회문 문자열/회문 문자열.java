import java.util.Scanner;

public class Main {

    public String solution(String input) {
        int lt = 0;
        int rt = input.length() - 1;

        while (lt < rt) {
            char[] chars = input.toLowerCase().toCharArray();
            if (chars[lt] != chars[rt]) return "NO";
            lt++;
            rt--;
        }
        return "YES";
    }

    public static void main(String[] args) {
        Main m = new Main();
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        System.out.println(m.solution(input));
    }
}