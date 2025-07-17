class Solution {
    public int solution(int number) {
        int answer = 0;
        
        for (int i = 1; i < number; i++) {
            if (number % i == 1) {
                answer = i;
                break;
            }
        }
        return answer;
    }
}