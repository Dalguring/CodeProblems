import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        int hIndex = 0;

        for (int i = 0; i < citations.length; i++) {
            int citation = citations[i];
            hIndex = Math.max(Math.min(citation, citations.length - i), hIndex);
        }
        
        return hIndex;
    }
}