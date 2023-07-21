import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();
        for(String whomParticipate : participant)
            map.put(whomParticipate, map.getOrDefault(whomParticipate, 0) + 1);
        for(String whomComplete : completion) {
            map.put(whomComplete, map.get(whomComplete) - 1);
            if(map.get(whomComplete) == 0)
                map.remove(whomComplete);
        }
        
        return map.keySet().iterator().next();
    }
}