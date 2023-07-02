import java.util.*;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        
        Map<String, Boolean> map = new LinkedHashMap<>();
        
        for (int i = 0; i < todo_list.length; i++) {
            if(!finished[i]) map.put(todo_list[i], finished[i]);
        }
        
        return map.keySet().stream().toArray(String[]::new);
    }
}