import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] sortedArray = Arrays.copyOf(emergency, emergency.length);
        Arrays.sort(sortedArray);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = sortedArray.length - 1; i >= 0; i--)
            map.put(sortedArray[i], emergency.length - i);

        int[] answer = new int[emergency.length];
        for (int i = 0; i < emergency.length; i++)
            answer[i] = map.get(emergency[i]);
        
        return answer;
    }
}