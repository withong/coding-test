package java.section02;

import java.util.Scanner;

public class Exam06 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        String answer = solution(input);
        System.out.println(answer);
    }

    public static String solution(String input) {
        StringBuilder sb = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (!sb.toString().contains(String.valueOf(c))) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static String solution2(String input) {
        String answer = "";

        for (int i = 0; i < input.length(); i++) {
            if (input.indexOf(input.charAt(i)) == i) {
                answer += input.charAt(i);
            }
        }
        return answer;
    }
}
