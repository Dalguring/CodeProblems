class Solution {
    public String solution(int q, int r, String code) {
        StringBuilder sb = new StringBuilder();
        sb.append(code.charAt(r));
        for (int i = q + r; i < code.length(); i += q) {
            sb.append(code.charAt(i));
        }
        
        return sb.toString();
    }
}