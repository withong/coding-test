import java.util.*;

public class Solution {
    public int solution(int num) {
        int answer = Arrays.stream(String.valueOf(num).split(""))
            .mapToInt(Integer::parseInt)
            .sum();

        return answer;
    }
}