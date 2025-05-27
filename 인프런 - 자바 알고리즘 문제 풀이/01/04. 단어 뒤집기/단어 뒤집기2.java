import java.util.Scanner;

public class Main {
    public static void main(String[] args){
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