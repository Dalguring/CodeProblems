class Solution {
    public String solution(String my_string, int[][] queries) {
        
        StringBuilder sb = new StringBuilder();
        StringBuilder answer = new StringBuilder(my_string);
        
        for (int i = 0; i < queries.length; i++) {
            sb.append(answer.substring(queries[i][0], queries[i][1] + 1)).reverse();
            answer.replace(queries[i][0], queries[i][1] + 1, sb.toString());
            sb.delete(0, sb.length());
        }
        
        return answer.toString();
    }
}