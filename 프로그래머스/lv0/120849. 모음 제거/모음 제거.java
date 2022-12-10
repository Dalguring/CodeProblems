import java.util.*;

class Solution {
    public String solution(String my_string) {
        
        String[] strArr = {"a", "e", "i", "o", "u"};
        
        for(String s : strArr) {
            my_string = my_string.replaceAll(s, "");
        }
        
        return my_string;
    }
}