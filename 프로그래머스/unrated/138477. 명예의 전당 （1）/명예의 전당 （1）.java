import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        for (int i = 0; i < score.length; i++) {
            Integer[] target = Arrays.copyOfRange(Arrays.stream(score).boxed().toArray(Integer[]::new), 0, i + 1);
            Arrays.sort(target, Collections.reverseOrder());
            if (target.length <= k)
                answer[i] = target[target.length - 1];
            else {
                target = Arrays.copyOfRange(target, 0, k);
                answer[i] = target[k - 1];
            }
        }
        
        return answer;
    }
}