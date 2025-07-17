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

        String[] answer = solution1(count, strArr);

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
}
