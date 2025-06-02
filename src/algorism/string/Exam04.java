package algorism.string;

import java.util.Scanner;

public class Exam04 {
/*
    N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.
    첫 줄에 자연수 N(3<=N<=20)이 주어집니다.
    두 번째 줄부터 N개의 단어가 각 줄에 하나씩 주어집니다. 단어는 영어 알파벳으로만 구성되어 있습니다.
    N개의 단어를 입력된 순서대로 한 줄에 하나씩 뒤집어서 출력합니다.
*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        scanner.nextLine();

        String[] strArr = new String[count];

        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = scanner.nextLine();
        }

        String[] answer = solution2(count, strArr);

        for (String s : answer) {
            System.out.println(s);
        }
    }

    public static String[] solution1(int num, String[] strArr) {
        String[] answer = new String[num];

        for (int i = 0; i < num; i++) {
            StringBuilder sb = new StringBuilder(strArr[i]);
            answer[i] = sb.reverse().toString();
        }

        return answer;
    }

    public static String[] solution2(int num, String[] strArr) {
        String[] answer = new String[num];

        for (int i = 0; i < num; i++) {
            char[] s = strArr[i].toCharArray();
            int lt = 0;
            int rt = strArr[i].length() - 1;

            while (lt < rt) {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;

                lt++;
                rt--;
            }
            answer[i] = String.valueOf(s);
        }
        return answer;
    }
}
