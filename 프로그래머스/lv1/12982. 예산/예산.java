import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int[] sum = new int[d.length];
        sum[0] = d[0];
        int answer = 1;
        if (d[0] > budget)
            return 0;

        for (int i = 1; i < sum.length; i++) {
            sum[i] = d[i] + sum[i - 1];
            if (sum[i] > budget)
                break;
            answer++;
        }
        
        return answer;
    }
}