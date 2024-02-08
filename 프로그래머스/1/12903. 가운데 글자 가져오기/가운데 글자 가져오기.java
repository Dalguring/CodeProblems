class Solution {
    public String solution(String s) {
        switch (s.length() % 2) {
            case 0: return s.substring(s.length() / 2 - 1, s.length() / 2 + 1);
            case 1: return String.valueOf(s.charAt(s.length() / 2));
        }
        
        return "";
    }
}