package algorism.level2;

public class Code31 {
/*
    길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요.
    예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴하면 됩니다.
*/
    public static void main(String[] args) {
        String result = solution(10);

        System.out.println("result = " + result);
    }

    public static String solution(int n) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sb.append(i % 2 ==0 ? "수" : "박");
        }
        return sb.toString();
    }
}
