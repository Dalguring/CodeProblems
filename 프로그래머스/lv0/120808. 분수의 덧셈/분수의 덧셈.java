class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int lcm = denom2 * denom1 / gcd(denom2, denom1);
        int numerator = (numer1 * lcm / denom1) + (numer2 * lcm / denom2);
        
        return new int[]{numerator / gcd(numerator, lcm), lcm / gcd(numerator, lcm)};
    }
    
    static int gcd(int denom2, int denom1) {
        int num = denom2 % denom1;
        if(num == 0) return denom1;
        denom2 = denom1;
        denom1 = num;

        return gcd(denom2, denom1);
    }
}