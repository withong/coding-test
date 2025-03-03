import java.util.Arrays;

class Solution {

    public long solution(long n) {
        char[] arr = String.valueOf(n).toCharArray();
        Arrays.sort(arr);

        StringBuilder stringBuilder = new StringBuilder(String.valueOf(arr));
        stringBuilder.reverse();

        return Long.parseLong(String.valueOf(stringBuilder));
    }
}