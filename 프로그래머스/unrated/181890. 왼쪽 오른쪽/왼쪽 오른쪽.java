import java.util.*;

class Solution {
    public String[] solution(String[] str_list) {
        
        List<String> list = new ArrayList<>(Arrays.asList(str_list));
        int rIdx = list.indexOf("r");
        int lIdx = list.indexOf("l");

        if(rIdx == -1 && lIdx == -1) return new String[]{};
        if(lIdx == 0) return new String[]{};
        if(rIdx == -1 && lIdx != 0) return Arrays.copyOfRange(str_list, 0, list.indexOf("l"));
        if(lIdx == -1 && rIdx != -1) return Arrays.copyOfRange(str_list, list.indexOf("r") + 1, str_list.length);
        if(lIdx != -1 && rIdx != -1) return list.indexOf("l") < list.indexOf("r") ?
                Arrays.copyOfRange(str_list, 0, list.indexOf("l")) :
                Arrays.copyOfRange(str_list, list.indexOf("r") + 1, str_list.length);
        else return new String[]{};
    }
}