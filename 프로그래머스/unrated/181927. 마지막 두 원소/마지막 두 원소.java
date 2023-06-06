import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = Arrays.copyOf(num_list, num_list.length + 1);
        int last = num_list[num_list.length - 1];
        int nextLast = num_list[num_list.length - 2];
        if(last > nextLast) {
            answer[answer.length - 1] = last - nextLast; 
        } else {
            answer[answer.length - 1] = 2 * last;
        }
        return answer;
    }
}