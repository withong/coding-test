package java.section02;

import java.util.Scanner;

public class Exam07 {

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

    public static String solution2(String input) {
        input = input.toLowerCase();
        int len = input.length();

        for (int i = 0; i < len / 2; i++) {
            if (input.charAt(i) != input.charAt(len - 1 - i)) {
                return "NO";
            }
        }
        return "YES";
    }
}
