import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        
        for (int element : arr) {
            if (element % divisor == 0) {
                list.add(element);
            }
        }

        if (list.isEmpty()) {
            return new int[] {-1};
        }

        Collections.sort(list);

        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}