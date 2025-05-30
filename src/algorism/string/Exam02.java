 package algorism.string;

import java.util.Scanner;

public class Exam02 {
/*
    대문자와 소문자가 같이 존재하는 문자열을 입력받아
    대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.
    문자열은 영어 알파벳으로만 구성되어 있습니다.
*/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        StringBuilder answer = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (Character.isLowerCase(c)) {
                c = Character.toUpperCase(c);
            } else {
                c = Character.toLowerCase(c);
            }
            answer.append(c);
        }

        System.out.println(answer);
    }
}
