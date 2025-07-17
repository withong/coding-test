package codekata;

import java.util.Arrays;

public class CodeKata47 {

    public static void main(String[] args) {
        String[] result = solution(new String[]{"sun", "bed", "car"}, 1);

        for (String s : result) {
            System.out.print(s + " ");
        }
    }

    public static String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];

        for (int i = 0; i < strings.length; i++) {
            char c = strings[i].charAt(n);
            answer[i] = c + strings[i];
        }

        Arrays.sort(answer);

        for (int i = 0; i < answer.length; i++) {
            answer[i] = answer[i].substring(1);
        }

        return answer;
    }
}
