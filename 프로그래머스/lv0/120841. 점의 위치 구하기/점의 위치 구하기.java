class Solution {
    public int solution(int[] dot) {
        String x = dot[0] > 0 ? "positive" : "negative";
        String y = dot[1] > 0 ? "positive" : "negative";
        int answer = 0;
        
        switch (x) {
            case "positive" : 
                switch(y) {
                    case "positive" : answer = 1; break;
                    case "negative" : answer = 4; break;
                }
                break;
            case "negative" : 
                switch(y) {
                    case "positive" : answer = 2; break;
                    case "negative" : answer = 3; break;
                }
                break;
        }
        
        return answer;
    }
}