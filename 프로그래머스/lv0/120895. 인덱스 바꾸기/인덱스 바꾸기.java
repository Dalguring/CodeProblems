class Solution {
    public String solution(String my_string, int num1, int num2) {
        char ch1 = my_string.charAt(num1);
        char ch2 = my_string.charAt(num2);
        String answer = "";
        
        for(int i = 0; i < my_string.length(); i++) {
        	if(i == num1) {
                answer += ch2; continue;
            } else if(i == num2) {
                answer += ch1; continue;
            }
        	answer += my_string.charAt(i);
        }
        
        return answer;
    }
}