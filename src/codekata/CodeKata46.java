package codekata;

public class CodeKata46 {

    public static void main(String[] args) {
        int solution = solution("2three45sixseven");
        System.out.println("solution = " + solution);
    }

    public static int solution(String s) {
        String[] numbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < numbers.length; i++) {
            s = s.replace(numbers[i], String.valueOf(i));
        }
        return Integer.parseInt(s);
    }
}
