class Solution {
    static int count = 0;
    
    public int solution(int n) {
        for (int i = 1; i <= n / 2; i++) {
            calc(i, n);
        }
        count++;
        
        return count;
    }
    
    static void calc(int i, int n) {
        int sum = 0;
        while (i <= n) {
            sum += i;
            if (sum == n) {
                count++;
                break;
            } else if (sum > n) {
                break;
            }
            
            i++;
        }
    }
}