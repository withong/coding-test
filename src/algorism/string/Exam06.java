package algorism.string;

import java.util.Scanner;

public class Exam06 {
/*
    소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.
    중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.
*/
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
