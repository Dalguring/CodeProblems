class Solution {
    public String solution(String my_string, int[] indices) {
        
        StringBuilder sb = new StringBuilder(my_string);
        
        for(int i : indices) {
            sb.replace(i, i + 1, " ");
        }
        
        return sb.toString().replace(" ", "");
    }
}