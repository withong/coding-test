class Solution {
    public long solution(int price, int money, int count) {
        long amount = (long) price * count * (count + 1) / 2;

        if (amount <= money) {
            return 0;
        } else {
            return (amount - money);
        }
    }
}