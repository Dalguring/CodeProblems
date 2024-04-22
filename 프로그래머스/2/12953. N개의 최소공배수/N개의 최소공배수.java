import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public int solution(int[] arr) {
        Queue<Integer> queue = new PriorityQueue<>();
        int gcdNum = 0;

        for (int i : arr) {
            queue.offer(i);
        }

        int pre = queue.poll();

        while (!queue.isEmpty()) {
            int next = queue.poll();
            gcdNum = gcd(pre, next);
            pre = pre * next / gcdNum;
        }
        
        return pre;
    }
    
    static int gcd(int pre, int next) {
        if (next % pre == 0) {
            return pre;
        }

        return gcd(next % pre, pre);
    }
}