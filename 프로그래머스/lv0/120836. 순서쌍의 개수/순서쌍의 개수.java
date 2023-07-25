class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if(n % i == 0)
                answer += 2;
            if((int)Math.ceil(Math.sqrt(n)) == i)
                answer -= 1;
        }
        
        return answer;
    }
}