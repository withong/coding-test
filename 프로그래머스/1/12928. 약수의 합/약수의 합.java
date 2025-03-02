class Solution {

    public int solution(int num) {
        int answer = 0;
        int sqrt = (int) Math.sqrt(num);

        for (int i = 1; i <= sqrt; i++) {
            if (num % i == 0) {
                answer += i;
                if (i != (num / i)) {
                    answer += num/i;
                }
            }
        }
        return answer;
    }
}