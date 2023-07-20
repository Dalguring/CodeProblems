import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] chargeTo100 = new int[progresses.length];
        for (int i = 0; i < progresses.length; i++) {
            chargeTo100[i] = (int)Math.ceil(((double)100 - progresses[i]) / speeds[i]);
        }
        
        Queue<Integer> queue = new LinkedList<>();
        for(int i : chargeTo100)
            queue.offer(i);

        int target = chargeTo100[0];
        int cnt = 0;
        List<Integer> list = new ArrayList<>();
        while(queue.size() != 0) {
            if(queue.peek() <= target) {
                cnt++;
                queue.poll();
                if(queue.size() == 0)
                    list.add(cnt);
            } else {
                list.add(cnt);
                target = queue.peek();
                cnt = 0;
            }
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}