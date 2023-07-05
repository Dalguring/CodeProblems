import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        String[] strArr = my_string.trim().split(" ");
        List<String> list = new ArrayList<>();
        
        for (int i = 0; i < strArr.length; i++) {
            if(!strArr[i].equals("")) list.add(strArr[i]);
        }
        
        return list.stream().toArray(String[]::new);
    }
}