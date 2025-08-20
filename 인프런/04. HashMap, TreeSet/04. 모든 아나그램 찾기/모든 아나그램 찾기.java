import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public int solution(String s, String t) {
        int answer = 0;
        HashMap<Character, Integer> smap = new HashMap<>();
        HashMap<Character, Integer> tmap = new HashMap<>();

        for (char c : t.toCharArray()) {
            tmap.put(c, tmap.getOrDefault(c, 0) + 1);
        }

        int len = t.length() - 1;
        for (int i = 0; i < len; i++) {
            smap.put(s.charAt(i), smap.getOrDefault(s.charAt(i), 0) + 1);
        }

        int lt = 0;
        for (int rt = len; rt < s.length(); rt++) {
            smap.put(s.charAt(rt), smap.getOrDefault(s.charAt(rt), 0) + 1);
            if (smap.equals(tmap)) answer++;

            smap.put(s.charAt(lt), smap.get(s.charAt(lt)) - 1);
            if (smap.get(s.charAt(lt)) == 0) smap.remove(s.charAt(lt));

            lt++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner in = new Scanner(System.in);

        String s = in.next();
        String t = in.next();

        System.out.println(main.solution(s, t));
    }
}