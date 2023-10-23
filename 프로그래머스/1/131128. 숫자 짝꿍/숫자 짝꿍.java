import java.io.*;
import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        Map<Character, Integer> xMap = new TreeMap<>();
        Map<Character, Integer> yMap = new TreeMap<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < X.length(); i++)
            xMap.put(X.charAt(i), xMap.getOrDefault(X.charAt(i), 0) + 1);

        for (int i = 0; i < Y.length(); i++)
            yMap.put(Y.charAt(i), yMap.getOrDefault(Y.charAt(i), 0) + 1);

        Iterator<Character> iterator = xMap.keySet().iterator();

        while (iterator.hasNext()) {
            char c = iterator.next();
            if (yMap.containsKey(c)) {
                int min = Math.min(xMap.get(c), yMap.get(c));
                sb.append(String.valueOf(c).repeat(min));
            }
        }
        if (sb.length() == 0) {
            sb.append("-1");
            return sb.toString();
        }
        
        if (sb.toString().replace("0", "").equals(""))
            return "0";
        
        return sb.reverse().toString();
    }
}