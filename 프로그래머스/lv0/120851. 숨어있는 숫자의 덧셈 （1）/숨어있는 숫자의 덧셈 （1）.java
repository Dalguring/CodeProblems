class Solution {
    public int solution(String my_string) {
        int answer = 0;
        for(int i = 0; i < my_string.length(); i++) {
            if(my_string.charAt(i) >= 'A' && my_string.charAt(i) <= 'z') continue;
            answer += my_string.charAt(i) - '0';
        }
        
        return answer;
    }
}