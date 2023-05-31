class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        for(int i = 0; i < code.length(); i++) {
            if(mode == 0) {
                switch(code.charAt(i)) {
                    case '1' : mode = 1; continue;
                    default  : if(i % 2 == 0) answer += code.charAt(i); else continue;
                }
            } else {
                switch(code.charAt(i)) {
                    case '1' : mode = 0; continue;
                    default  : if(i % 2 != 0) answer += code.charAt(i); else continue;
                }
            }
            
            
        }
        if(answer.length() == 0) answer = "EMPTY";
        
        return answer;
    }
}