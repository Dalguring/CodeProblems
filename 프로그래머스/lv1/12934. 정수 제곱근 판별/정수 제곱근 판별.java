class Solution {
    public long solution(long n) {
        if((long)Math.sqrt(n) == Math.sqrt(n))
            return (long)Math.pow(Math.sqrt(n) + 1, 2);
        else
            return (long)-1;
    }
}