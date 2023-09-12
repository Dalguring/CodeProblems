class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for (int i = left; i <= right; i++) {
            int divisor = 0;
            for (int j = 1; j <= Math.sqrt(i); j++) {
                if (i % j == 0)
                    divisor += 2;
                if (j * j == i)
                    divisor -= 1;
            }
            if (divisor % 2 == 0)
                answer += i;
            else answer -= i;
        }
        
        return answer;
    }
}