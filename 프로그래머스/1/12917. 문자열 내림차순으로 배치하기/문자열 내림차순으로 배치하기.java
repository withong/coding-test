import java.util.Arrays;

class Solution {

    public String solution(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder(String.valueOf(arr));
        sb.reverse();

        return sb.toString();
    }
}