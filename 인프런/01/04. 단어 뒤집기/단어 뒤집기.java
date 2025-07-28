import java.util.Scanner;

public class Main {

    public String[] solution(int count, String[] arr) {
        String[] answer = new String[count];

        for (int i = 0; i < count; i++) {
            char[] chars = arr[i].toCharArray();
            int lt = 0;
            int rt = arr[i].length() - 1;

            while (lt < rt) {
                char tmp = chars[lt];
                chars[lt] = chars[rt];
                chars[rt] = tmp;

                lt++;
                rt--;
            }
            answer[i] = String.valueOf(chars);
        }

        return answer;
    }

    public static void main(String[] args) {
        Main m = new Main();
        Scanner in = new Scanner(System.in);

        int count = in.nextInt();
        in.nextLine();

        String[] arr = new String[count];
        for (int i = 0; i < count; i++) {
            arr[i] = in.nextLine();
        }

        for (String answer : m.solution(count, arr)) {
            System.out.println(answer);
        }
    }
}