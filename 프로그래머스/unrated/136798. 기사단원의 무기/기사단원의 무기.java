class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;

        for (int i = 1; i <= number; i++) {
            int divisor = 0;
            for (int j = 1; j <= Math.sqrt(i); j++) {
                if (i % j == 0)
                    divisor += 2;
                if (i / (double)j == j)
                    divisor -= 1;
            }
            if (divisor > limit)
                answer += power;
            else
                answer += divisor;
        }
        
        return answer;
    }
}