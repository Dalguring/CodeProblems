import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int size = 1;
        
        while (size < arr.length) {
            size = size << 1;
        }
        
        int[] answer = new int[size];
        Arrays.fill(answer, 0);
        
        for (int i = 0; i < arr.length; i++) {
            answer[i] = arr[i];
        }
        
        return answer;
    }
}