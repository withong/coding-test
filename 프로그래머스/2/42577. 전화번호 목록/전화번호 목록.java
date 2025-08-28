import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        HashSet<String> set = new HashSet<>();
        
        for (String number : phone_book) {
            set.add(number);
        }
        
        for (String number : phone_book) {
            for (int cut = 1; cut < number.length(); cut++) {
                String prefix = number.substring(0, cut);
                if (set.contains(prefix)) {
                    return false;
                }
            }
        }
        
        return answer;
    }
}