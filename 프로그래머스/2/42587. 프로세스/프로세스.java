import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<Node2> nodeQ = new LinkedList<>();
        Queue<Integer> pq = new PriorityQueue<>(((o1, o2) -> o2 - o1));

        for (int i = 0; i < priorities.length; i++) {
            nodeQ.add(new Node2(priorities[i], i));
            pq.add(priorities[i]);
        }

        int answer = 0;
        while (!nodeQ.isEmpty()) {
            Node2 node = nodeQ.poll();
            if (node.priority == pq.peek()) {
                answer++;
                pq.poll();
            } else {
                nodeQ.add(node);
                continue;
            }
            if (node.location == location)
                break;
        }

        return answer;
    }
}

class Node2 {
    int priority;
    int location;

    public Node2(int priority, int location) {
        this.priority = priority;
        this.location = location;
    }
}