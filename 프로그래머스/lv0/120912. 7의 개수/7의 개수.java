class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        for(int i : array) {
            String seven = i+"";
            for(int j = 0; j < seven.length(); j++) {
                if(seven.charAt(j) == '7') answer++;
            }
        }
        
        return answer;
    }
}