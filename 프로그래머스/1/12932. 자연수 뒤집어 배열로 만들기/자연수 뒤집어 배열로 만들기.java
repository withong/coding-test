class Solution {

    public int[] solution(long num) {
        String str = String.valueOf(num);
        int[] answer = new int[str.length()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = str.charAt(str.length() - 1 - i) - '0';
        }
        return answer;
    }
}