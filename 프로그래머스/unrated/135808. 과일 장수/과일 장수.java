import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i : score)
            pq.add(i);

        int answer = 0;
        int min = Integer.MAX_VALUE;

        while (!pq.isEmpty()) {
            if (pq.size() < m)
                break;

            for (int i = 0; i < m; i++)
                min = Math.min(pq.poll(), min);

            answer += m * min;
            min = Integer.MAX_VALUE;
        }
        
        return answer;
    }
}