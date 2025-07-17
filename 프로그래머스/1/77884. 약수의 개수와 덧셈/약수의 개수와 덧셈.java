class Solution {
    public int solution(int left, int right) {
        int answer = 0;

        for (int i = left; i <= right; i++) {
            int sqrt = (int) Math.sqrt(i);

            if (sqrt * sqrt == i) {
                answer -= i;
            } else {
                answer += i;
            }
        }

        return answer;    }
}