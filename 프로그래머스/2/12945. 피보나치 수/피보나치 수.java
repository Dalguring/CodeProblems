class Solution {
    public int solution(int n) {
        int pre = 0;
        int now = 1;
        int target = 0;

        for (int i = 0; i < n - 1; i++) {
            target = (pre + now) % 1234567;
            pre = now;
            now = target;
        }
        
        return target;
    }
}