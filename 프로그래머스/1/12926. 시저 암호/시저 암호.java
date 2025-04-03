class Solution {

    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == ' ') {
                answer.append(' ');
            } else if (c >= 'A' && c <= 'Z') {
                int push = c + n;
                if (push > 'Z') push -= 26;
                answer.append((char) push);
            } else if (c >= 'a' && c <= 'z') {
                int push = c + n;
                if (push > 'z') push -= 26;
                answer.append((char) push);
            }
        }

        return answer.toString();
    }
}