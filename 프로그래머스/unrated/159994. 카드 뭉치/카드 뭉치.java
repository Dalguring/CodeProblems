import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        Queue<String> card1Queue = new LinkedList<>(Arrays.asList(cards1));
        Queue<String> card2Queue = new LinkedList<>(Arrays.asList(cards2));
        Queue<String> goalQueue = new LinkedList<>(Arrays.asList(goal));

        for (String s : goal) {
            if (goalQueue.peek().equals(card1Queue.peek())) {
                goalQueue.poll();
                card1Queue.poll();
            } else if (goalQueue.peek().equals(card2Queue.peek())) {
                goalQueue.poll();
                card2Queue.poll();
            } else
                return "No";
        }
        return "Yes";
    }
}