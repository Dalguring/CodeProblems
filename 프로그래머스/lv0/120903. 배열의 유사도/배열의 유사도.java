class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        for(String str2 : s2) {
            for(String str1 : s1) {
                if(str2.equals(str1)) {
                    answer++;
                    break;
                }
            }
        }
        
        return answer;
    }
}