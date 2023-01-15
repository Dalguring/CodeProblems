class Solution {
    public int solution(int num, int k) {
        String answer = num+"";
        int reAnswer = 0;
        
        for(int i = 0; i < answer.length(); i++) {
            if(answer.charAt(i)-'0' == k) {
                reAnswer = i+1;
                break;
            } else {
                reAnswer = -1;
            }
        }
        return reAnswer;
    }
}