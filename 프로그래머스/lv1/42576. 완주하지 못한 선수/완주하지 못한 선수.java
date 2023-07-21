import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();
        
        for(String whomParticipate : participant)
            map.put(whomParticipate, map.getOrDefault(whomParticipate, 0) + 1);
        
        for(String whomComplete : completion) {
            if(map.containsKey(whomComplete))
                map.put(whomComplete, map.get(whomComplete) - 1);
        }
        StringBuilder sb = new StringBuilder();
        for(Map.Entry<String, Integer> el : map.entrySet()) {
            if(el.getValue() > 0) 
                sb.append(el.getKey());    
        }
        
        return sb.toString();
    }
}