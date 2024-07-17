import java.util.*;

class Solution {
    public int solution(int[] order) {
        Queue<Integer> mainBelt = new LinkedList<>();
        Stack<Integer> subBelt = new Stack<>();
        int pointer = 0;
        int count = 0;

        for (int i = 1; i <= order.length; i++) {
            mainBelt.offer(i);
        }

        while (!mainBelt.isEmpty()) {
            int target = order[pointer];

            if (mainBelt.peek() != target) {
                if (!subBelt.isEmpty()) {
                    if (subBelt.peek() == target) {
                        subBelt.pop();
                        pointer++;
                        count++;
                    } else {
                        subBelt.push(mainBelt.poll());
                    }
                } else {
                    subBelt.push(mainBelt.poll());
                }
            } else {
                mainBelt.poll();
                pointer++;
                count++;
            }
        }

        if (!subBelt.isEmpty()) {
            if (subBelt.peek() == order[pointer]) {
                while (!subBelt.isEmpty() && subBelt.peek() == order[pointer]) {
                    subBelt.pop();
                    pointer++;
                    count++;
                }
            }
        }

        return count;
    }
}