import java.util.*;
import java.util.stream.*;

class Solution {
    public String[] solution(String[] strArr) {

        return Arrays.stream(strArr).filter(o -> !o.contains("ad")).collect(Collectors.toList()).stream().toArray(String[]::new);
    }
}