import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(String str1, String str2) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        list1 = makeMultiset(str1, list1);
        list2 = makeMultiset(str2, list2);

        if (list1.size() == 0 && list2.size() == 0) {
            return 65536;
        }
        
        int union = list1.size() + list2.size();
        int intersection = list1.size();
        int pointer = 0;

        while (pointer < list2.size()) {
            if (list1.contains(list2.get(pointer))) {
                list1.remove(list2.get(pointer));
            }
            pointer++;
        }
        
        intersection -= list1.size();
        union -= intersection;
        
        return (int) (intersection / (double) union * 65536);
    }
    
    static List<String> makeMultiset(String str, List<String> list) {
        str = str.toLowerCase();

        for (int i = 0; i < str.length() - 1; i++) {
            String someStr = str.substring(i, i + 2);
            if (someStr.matches("[a-z]*")) {
                list.add(someStr);
            }
        }

        return list;
    }
}