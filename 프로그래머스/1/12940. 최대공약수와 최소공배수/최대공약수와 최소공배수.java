class Solution {
    public int[] solution(int n, int m) {
        int large = n > m ? n : m;
        int small = n < m ? n : m;
        int gcd = gcd(large, small);
        int lmc = n * m / gcd;
            
        return new int[]{gcd, lmc};
    }
    
    static int gcd(int large, int small) {
        if (large % small == 0)
            return small;
        return gcd(small, large % small);
    }
}