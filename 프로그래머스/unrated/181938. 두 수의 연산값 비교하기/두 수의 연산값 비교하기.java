class Solution {
    public int solution(int a, int b) {
        
        return Math.max(Integer.parseInt(String.valueOf(a) + String.valueOf(b)), 2 * a * b);
    }
}