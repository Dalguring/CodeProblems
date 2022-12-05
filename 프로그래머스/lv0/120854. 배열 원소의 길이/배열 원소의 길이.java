class Solution {
    public int[] solution(String[] strlist) {    
        int[] answer = new int[strlist.length];
        int cnt = 0;
        for(String s : strlist) {
            answer[cnt] = s.length();
            cnt++;
        }
        
        return answer;
    }
}