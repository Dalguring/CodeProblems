class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for (Character c : s.toCharArray()) {
            if (c == ' ') {
                sb.append(" ");
                continue;
            }
            boolean isCapital = String.valueOf(c).toUpperCase().equals(String.valueOf(c));
            
            if (c + n > 'Z' && isCapital) {
                sb.append((char) (c + n - ('Z' - 'A' + 1)));
            } else if (c + n > 'z') {
                sb.append((char) (c + n - ('Z' - 'A' + 1)));
            } else {
                sb.append((char) (c + n));
            }
        }
        
        return sb.toString();
    }
}