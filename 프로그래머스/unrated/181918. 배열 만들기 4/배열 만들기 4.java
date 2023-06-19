import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int i = 0;
        List<Integer> list = new LinkedList<>();
        while(i < arr.length) {
            if(list.isEmpty()) list.add(arr[i]);
            else if(!list.isEmpty() && list.get(list.size() - 1) < arr[i]) list.add(arr[i]);
            else if(!list.isEmpty() && list.get(list.size() - 1) >= arr[i]) {
                list.remove(list.get(list.size() - 1));
                continue;
            }
            i++;
        }
        
        return list.stream().mapToInt(e -> e).toArray();
    }
}