package codekata;

public class CodeKata30 {
/*
    단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요.
    단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
*/
    public static void main(String[] args) {
        String str = "abcde";
        String result = solution(str);

        System.out.println("result = " + result);
    }

    public static String solution(String s) {
        return s.substring((s.length() - 1) / 2, (s.length() / 2) + 1);
    }
}
