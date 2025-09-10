import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> answer = new ArrayList<>();
        Queue<Integer> days = new LinkedList<>();
        
        for (int i = 0; i < progresses.length; i++) {
            int remain = 100 - progresses[i];
            int day = (int) Math.ceil((double) remain / speeds[i]);
            days.add(day);
        }
        
        while (!days.isEmpty()) {
            int current = days.poll();
            int count = 1;
            
            while (!days.isEmpty() && days.peek() <= current) {
                days.poll();
                count++;
            }
            
            answer.add(count);
        }
        
        return answer;
    }
}