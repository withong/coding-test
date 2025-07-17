package codekata;

public class CodeKata45 {
/*
    어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다.
    예를 들어 "AB"는 1만큼 밀면 "BC"가 되고, 3만큼 밀면 "DE"가 됩니다. "z"는 1만큼 밀면 "a"가 됩니다.
    문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해 보세요.
*/
    public static void main(String[] args) {
        String s = "a B z";
        String result = solution(s, 4);
        System.out.println("result = " + result);
    }

    public static String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == ' ') {
                answer.append(' ');
            } else if (c >= 'A' && c <= 'Z') {
                int push = c + n;
                if (push > 'Z') push -= 26;
                answer.append((char) push);
            } else if (c >= 'a' && c <= 'z') {
                int push = c + n;
                if (push > 'z') push -= 26;
                answer.append((char) push);
            }
        }

        return answer.toString();
    }
}
