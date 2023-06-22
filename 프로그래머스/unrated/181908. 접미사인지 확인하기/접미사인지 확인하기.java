import java.util.*;

class Solution {
    public int solution(String my_string, String is_suffix) {
        List<String> stringList = new ArrayList<>();
        
        for (int i = 0; i < my_string.length(); i++) {
            stringList.add(my_string.substring(i));
        }
        
        return stringList.contains(is_suffix) ? 1 : 0;
    }
}