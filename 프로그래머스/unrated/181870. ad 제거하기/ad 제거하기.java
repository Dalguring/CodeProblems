import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        boolean[] containsAd = new boolean[strArr.length];
        for(int i = 0; i < strArr.length; i++) {
            containsAd[i] = strArr[i].contains("ad");
        }

        List<String> list = new LinkedList<>();
        for(int i = 0; i < containsAd.length; i++) {
            if(containsAd[i]) continue;
            else list.add(strArr[i]);
        }

        return list.stream().toArray(String[]::new);
    }
}