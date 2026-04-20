import java.util.*;

class Solution {
    public int[] solution(int n, int m) {
        int a = n;
        int b = m;

        // 최대공약수(유클리드 호제법)
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        int gcd = a;

        // 최소공배수
        int lcm = (n * m) / gcd;

        return new int[]{gcd, lcm};
    }
}