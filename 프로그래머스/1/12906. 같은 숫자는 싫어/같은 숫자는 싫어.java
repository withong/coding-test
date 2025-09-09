import java.util.*;

public class Solution {
    public ArrayList<Integer> solution(int [] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        
        for (int i = 0; i < arr.length; i++) {
            queue.offer(arr[i]);
        }
        
        int prev = -1;
        
        while (!queue.isEmpty()) {
            int current = queue.poll();
            
            if (current != prev) {
                answer.add(current);
                prev = current;
            }
        }
        
        return answer;
    }
}