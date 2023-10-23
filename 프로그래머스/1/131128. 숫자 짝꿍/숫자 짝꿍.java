import java.io.*;
import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        PriorityQueue<Integer> xpq = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> ypq = new PriorityQueue<>(Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < X.length(); i++)
            xpq.add(X.charAt(i) - '0');

        for (int i = 0; i < Y.length(); i++)
            ypq.add(Y.charAt(i) - '0');

        while (!xpq.isEmpty() && !ypq.isEmpty()) {
            if (xpq.peek() == ypq.peek()) {
                sb.append(xpq.poll());
                ypq.poll();
            } else if (xpq.peek() > ypq.peek()) {
                xpq.poll();
            } else
                ypq.poll();
        }
        
        return sb.toString().equals("") ? "-1" : sb.toString().charAt(0) == '0' ? "0" : sb.toString();
    }
}