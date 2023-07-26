class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        String regex = "[^"+k+"]";
        for (int l = i; l <= j; l++) 
            answer += String.valueOf(l).replaceAll(regex, "").length();
        
        return answer;
    }
}