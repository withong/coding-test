import java.util.Scanner;

public class Main {

    public String solution(String input) {
        int lt = 0;
        int rt = input.length() - 1;
        char[] chars = input.toCharArray();

        while (lt < rt) {
            if (!Character.isAlphabetic(chars[lt])) {
                lt++;
            } else if (!Character.isAlphabetic(chars[rt])) {
                rt--;
            } else {
                char tmp = chars[lt];
                chars[lt] = chars[rt];
                chars[rt] = tmp;
                lt++;
                rt--;
            }
        }

        return String.valueOf(chars);
    }

    public static void main(String[] args) {
        Main m = new Main();
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        System.out.println(m.solution(input));
    }
}