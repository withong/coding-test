package java.section02;

import java.util.Scanner;

public class Exam03 {
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
