import java.util.*;

class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;

        Queue<Integer> queue = new LinkedList<>();
        for(int num : numbers) queue.add(num);

        int cnt = 1;
        while(cnt !=k){
            queue.add(queue.poll());
            queue.add(queue.poll());
            cnt++;
        }
        answer = queue.poll();
        return answer;
    }
}