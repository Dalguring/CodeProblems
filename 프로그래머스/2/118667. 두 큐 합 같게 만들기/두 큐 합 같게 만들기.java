import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int[] queue1, int[] queue2) {
        
        Queue<Long> numQueue1 = new LinkedList<>();
        Queue<Long> numQueue2 = new LinkedList<>();

        for (long number : queue1) {
            numQueue1.offer(number);
        }
        for (long number : queue2) {
            numQueue2.offer(number);
        }

        int cycle = 0;
        long sum1 = getSum(numQueue1);
        long sum2 = getSum(numQueue2);
        long temp = 0;
        
        if (sum1 == sum2) {
            return 0;
        }

        while (cycle <= 3 * queue1.length) {

            if (sum1 > sum2) {
                temp = numQueue1.poll();
                numQueue2.offer(temp);
                sum1 -= temp;
                sum2 += temp;
            } else {
                temp = numQueue2.poll();
                numQueue1.offer(temp);
                sum1 += temp;
                sum2 -= temp;
            }

            cycle++;

            if (sum1 == sum2) {
                break;
            }
        }

        if (cycle > 3 * queue1.length) {
            cycle = -1;
        }
        
        return cycle;
    }
    
    static long getSum(Queue<Long> queue) {
        return queue.stream()
                .mapToLong(Long::longValue)
                .sum();
    }
}