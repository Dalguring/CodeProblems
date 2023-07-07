import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (String s : myStr.split("[a-c]")) {
            if (s.length() != 0) arrayList.add(s);
        }
        if(arrayList.size() == 0)
            arrayList.add("EMPTY");
        
        return arrayList.stream().toArray(String[]::new);
    }
}