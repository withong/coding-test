import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String answer = "";

        String[] inputArr = input.split(" ");
        int maxLen = 0;

        for (String str : inputArr) {
            int strLen = str.length();
            if (strLen > maxLen) {
                maxLen = strLen;
                answer = str;
            }
        }

        System.out.println(answer);
    }
}