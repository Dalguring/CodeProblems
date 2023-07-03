class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        for(int i : num_list) {
            answer += toOne(i);
        }
        
        return answer;
    }
    
    static int toOne(int i) {
        int cnt = 0;
        while(i != 1) {
            cnt++;
            i = i % 2 == 0 ? i / 2 : (i - 1) / 2;
        }
        if(i == 1) return cnt;

        return toOne(i);
    }
}