class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n; i++) {
            answer = notThree(answer);
        }
        
        return answer;
    }
    
    static int notThree(int answer) {
        answer++;
        if(answer % 3 != 0 && !String.valueOf(answer).contains("3"))
            return answer;

        return notThree(answer);
    }
}