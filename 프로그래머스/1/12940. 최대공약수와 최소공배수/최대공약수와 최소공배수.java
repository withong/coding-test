import java.math.BigInteger;

class Solution {

    public int[] solution(int n, int m) {
        BigInteger a = BigInteger.valueOf(n);
        BigInteger b = BigInteger.valueOf(m);

        int gcd = a.gcd(b).intValue();
        int lcm = n * m / gcd;

        return new int[]{gcd, lcm};
    }
}