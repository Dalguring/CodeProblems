class Solution {
    public int solution(String[] babbling) {
        int cnt = 0;
		for(String s : babbling) {
			cnt += bab(s);
		}
		
        return cnt;
    }
    
    public static int bab(String bab) {
		
		if(bab.contains("aya")) {
			bab = bab.replace("aya", " ").trim();
		} 
		if(bab.contains("ye")) {
			bab = bab.replace("ye", " ").trim();
		} 
		if(bab.contains("woo")) {
			bab = bab.replace("woo", " ").trim();
		}
		if(bab.contains("ma")) {
			bab = bab.replace("ma", " ").trim();
		}
		
		if(bab.length() == 0) return 1;
		else return 0;
		
	}
}