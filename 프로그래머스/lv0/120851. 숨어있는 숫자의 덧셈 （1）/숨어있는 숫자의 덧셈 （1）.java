class Solution {
    public int solution(String my_string) {
        my_string = my_string.replaceAll("[A-Z|a-z]", "");
        int answer = 0;
        for(char c : my_string.toCharArray()) 
            answer += c - '0';
        
        return answer;
    }
}