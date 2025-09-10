import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> bridge = new LinkedList<>();
        int answer = 0;
        int current_weight = 0;
        
        for (int i = 0; i < bridge_length; i++) {
            bridge.add(0);
        }
        
        int idx = 0;
        
        while (!bridge.isEmpty()) {
            answer++;
            current_weight -= bridge.poll();
            
            if (idx < truck_weights.length) {
                if (current_weight + truck_weights[idx] <= weight) {
                    bridge.add(truck_weights[idx]);
                    current_weight += truck_weights[idx];
                    idx++;
                } else {
                    bridge.add(0);
                }
            }
        }
        
        return answer;
    }
}