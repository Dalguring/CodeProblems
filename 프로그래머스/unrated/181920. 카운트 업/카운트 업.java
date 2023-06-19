import java.util.stream.*;

class Solution {
    public int[] solution(int start, int end) {
                
        return IntStream.rangeClosed(start, end).toArray();
    }
}