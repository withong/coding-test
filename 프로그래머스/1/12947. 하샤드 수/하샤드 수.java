class Solution {

    public boolean solution(int x) {
        String str = String.valueOf(x);
        int sum = str.chars().map(c -> c - '0').sum();

        return x % sum == 0;
    }
}