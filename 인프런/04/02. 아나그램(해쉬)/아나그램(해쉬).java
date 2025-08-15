import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public String solution(String a, String b) {
        String answer = "YES";
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : a.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : b.toCharArray()) {
            if (!map.containsKey(c) || map.get(c) == 0) return "NO";
            map.put(c, map.get(c) - 1);
        }

        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner in = new Scanner(System.in);

        String a = in.next();
        String b = in.next();

        System.out.println(main.solution(a, b));
    }
}