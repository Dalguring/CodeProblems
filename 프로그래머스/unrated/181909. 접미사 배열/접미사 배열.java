import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        List<String> stringList = new ArrayList<>();
        
        for (int i = 0; i < my_string.length(); i++) {
            stringList.add(my_string.substring(i));
        }
        
        Collections.sort(stringList);
        
        return stringList.toArray(new String[0]);
    }
}