import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        Queue<Integer> pq = new PriorityQueue<>();
        for (int i : scoville)
            pq.add(i);

        int answer = 0;
        while (pq.peek() < K && answer <= scoville.length - 2) {
            pq.add(pq.poll() + pq.poll() * 2);
            answer++;
        }
        
        if (pq.peek() < K)
            answer = -1;
        
        return answer;
    }
}