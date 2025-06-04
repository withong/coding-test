import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        String answer = solution(input);
        System.out.println(answer);
    }

    public static String solution(String str) {

        char[] chars = str.toCharArray();
        int lt = 0;
        int rt = str.length() - 1;

        while (lt < rt) {
            if (!Character.isLetter(chars[lt])) {
                lt++;
            } else if (!Character.isLetter(chars[rt])) {
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

}
