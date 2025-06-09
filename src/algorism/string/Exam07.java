package algorism.string;

import java.util.Scanner;

public class Exam07 {
/*
    앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다.
    문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 회문 문자열이 아니면 “NO"를 출력하는 프로그램을 작성하세요.
    단 회문을 검사할 때 대소문자를 구분하지 않습니다. 첫 줄에 길이 100을 넘지 않는 공백이 없는 문자열이 주어집니다.
*/
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
