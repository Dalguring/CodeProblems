class Solution {
    public int solution(String t, String p) {
        int result = 0;
		for(int i = 0; i <= t.length() - p.length(); i++) {
			result += Long.parseLong(t.substring(i, i + p.length())) <= Long.parseLong(p) ? 1 : 0;
		}
        
        return result;
    }
}