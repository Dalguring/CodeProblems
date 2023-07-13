class Solution {
    public String[] solution(String[] picture, int k) {
        StringBuilder answer = new StringBuilder();
        String dot = "";
        String x = "";
        for (int i = 0; i < k; i++) {
            dot = dot.concat(".");
            x = x.concat("x");
        }

        for (String s : picture) {
            for (int i = 0; i < k; i++) {
                answer.append(s.replace(".", dot).replace("x", x)).append(" ");
            }
        }
        
        return answer.toString().split(" ");
    }
}