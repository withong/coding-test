package codekata;

public class CodeKata41 {
/*
    문자열 s는 한 개 이상의 단어로 구성되어 있습니다.각 단어는 하나 이상의 공백문자로 구분되어 있습니다.
    각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.
*/
    public static void main(String[] args) {
        String q = "hello spring world";
        StringBuilder sb = new StringBuilder();

        int index = 0;
        for (int i = 0; i < q.length(); i++) {
            char letter = q.charAt(i);

            if (letter == ' ') {
                index = 0;
                sb.append(letter);
                continue;
            }

            if (index % 2 == 0) {
                sb.append(Character.toUpperCase(letter));
            } else {
                sb.append(Character.toLowerCase(letter));
            }
            index++;
        }
        System.out.println("answer = " + sb.toString());
    }
}
