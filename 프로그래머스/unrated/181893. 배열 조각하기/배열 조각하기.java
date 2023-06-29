import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        int first = 0;
        int end = arr.length - 1;
        int[] answer = Arrays.copyOf(arr, arr.length);
        for(int i = 0; i < query.length; i++) {
            if(i % 2 == 0) {
                end = query[i];
                answer = Arrays.copyOfRange(answer, 0, end + 1);
            }
            else  {
                first = query[i];
                answer = Arrays.copyOfRange(answer, first, answer.length);
            }
        }
        
        return answer;
    }
}