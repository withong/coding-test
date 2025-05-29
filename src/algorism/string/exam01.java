package algorism.string;

import java.util.Scanner;

public class exam01 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input1 = in.nextLine().toLowerCase();
        char input2 = in.nextLine().toLowerCase().charAt(0);

        int count = 0;

        for (char c : input1.toCharArray()) {
            if (c == input2) count++;
        }

        System.out.println("count = " + count);
    }
}
