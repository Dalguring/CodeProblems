import java.util.*;
import java.util.stream.IntStream;

class Solution {
    public int solution(String dartResult) {
        Map<String, Integer> eventMap = new HashMap<>();
        eventMap.put("S", 1);
        eventMap.put("D", 2);
        eventMap.put("T", 3);
        eventMap.put("*", 2);
        eventMap.put("#", -1);
        int order = 0;
        int[] dartScore = new int[3];

        StringTokenizer st = new StringTokenizer(dartResult.replaceAll("[^0-9]", " "));
        dartScore[0] = Integer.parseInt(st.nextToken());
        dartScore[1] = Integer.parseInt(st.nextToken());
        dartScore[2] = Integer.parseInt(st.nextToken());

        for (String s : dartResult.split("")) {
            if (s.matches("[0-9]")) {
                continue;
            }
            if (eventMap.containsKey(s)) {
                if (s.equals("S") || s.equals("D") || s.equals("T")) {
                    order++;
                    dartScore[order - 1] = (int) Math.pow(dartScore[order - 1], eventMap.get(s));
                } else {
                    if (s.equals("*")) {
                        if (order >= 2) {
                            dartScore[order - 2] = eventMap.get(s) * dartScore[order - 2];
                        }
                    }
                    
                    dartScore[order - 1] = eventMap.get(s) * dartScore[order - 1];
                }
            }
        }
        
        return IntStream.of(dartScore).sum();
    }
}