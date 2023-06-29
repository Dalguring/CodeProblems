import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr) {
        if(Arrays.stream(arr).boxed().collect(Collectors.toList()).contains(2))
        return Arrays.copyOfRange(arr, Arrays.stream(arr).boxed().collect(Collectors.toList()).indexOf(2), Arrays.stream(arr).boxed().collect(Collectors.toList()).lastIndexOf(2) + 1);
        return new int[]{-1};
    }
}