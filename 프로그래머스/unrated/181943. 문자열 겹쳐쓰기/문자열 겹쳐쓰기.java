class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        StringBuilder sb = new StringBuilder();
        sb.append(my_string.substring(0, s)).append(overwrite_string).append(my_string.substring(s + overwrite_string.length()));
        return sb.toString();
    }
}