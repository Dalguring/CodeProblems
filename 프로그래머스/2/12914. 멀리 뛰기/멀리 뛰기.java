class Solution {
    public long solution(int n) {
        long d1 = 1;
        long d2 = 2;
        long stairs = 0;
        
        if (n < 3) {
            return n;
        }
        
        for (int i = 3; i <= n; i++) {
            stairs = (d1 + d2) % 1234567;
            d1 = d2;
            d2 = stairs;
        }
        
        return stairs;
    }
}