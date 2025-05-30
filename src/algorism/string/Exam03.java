package algorism.string;

import java.util.Scanner;

public class Exam03 {
/*
    한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
    문장속의 각 단어는 공백으로 구분됩니다.
    가장 길이가 긴 단어가 여러개일 경우 문장속에서 가장 앞쪽에 위치한 단어를 답으로 합니다.
*/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String answer = "";

        int max = 0;
        int pos;

        while ((pos = input.indexOf(' ')) != -1) {
            String word = input.substring(0, pos);
            int len = word.length();

            if (len > max) {
                max = len;
                answer = word;
            }
            input = input.substring(pos + 1);
        }

        if (input.length() > max) {
            answer = input;
        }

        System.out.println(answer);

//        String[] inputArr = input.split(" ");
//        int maxLen = 0;
//
//        for (String str : inputArr) {
//            int strLen = str.length();
//            if (strLen > maxLen) {
//                maxLen = strLen;
//                answer = str;
//            }
//        }

    }
}
