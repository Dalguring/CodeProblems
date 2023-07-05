import java.util.*;

class Solution {
    public String[] solution(String myString) {
        StringTokenizer st = new StringTokenizer(myString, "x");
        List<String> list = new ArrayList<>();
        
        while(st.hasMoreTokens())
            list.add(st.nextToken());

        Collections.sort(list);
        
        return list.stream().toArray(String[]::new);
    }
}