import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        StringBuilder answer = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (Character.isLowerCase(c)) {
                c = Character.toUpperCase(c);
            } else {
                c = Character.toLowerCase(c);
            }
            answer.append(c);
        }
        System.out.println(answer);
    }
}