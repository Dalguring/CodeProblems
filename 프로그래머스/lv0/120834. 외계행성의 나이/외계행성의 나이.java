class Solution {
    public String solution(int age) {
        String answer = "";
        String ageVal = age + "";
        
        for(int i = 0; i < ageVal.length(); i++) {
            answer += (char)(ageVal.charAt(i) + 'a' - '0');
        }
        
        return answer;
    }
}