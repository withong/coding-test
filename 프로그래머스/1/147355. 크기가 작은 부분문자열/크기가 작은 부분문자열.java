class Solution {
    public int solution(String t, String p) {
        int len = p.length();
        int count = 0;

        for (int i = 0; i < t.length() - len + 1; i++) {
            String s = t.substring(i, i + len);

            if (s.compareTo(p) <= 0) {
                count++;
            }
        }

        return count;
    }
}