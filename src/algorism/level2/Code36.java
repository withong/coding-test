package algorism.level2;

public class Code36 {
/*
    문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요.
    예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.
*/
    public static void main(String[] args) {

    }

    public static boolean solution(String s) {
        return (s.length() == 4 || s.length() == 6) && s.matches("^[0-9]+$");
    }
}
