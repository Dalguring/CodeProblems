class Solution {
    public String solution(String rsp) {
        String answer = "";
		
		for(int i = 0; i < rsp.length(); i++) {
			switch (rsp.charAt(i)) {
				case '2': answer += "0"; continue;
				case '0': answer += "5"; continue;
				case '5': answer += "2"; continue;
			}
		}
		
		return answer;
    }
}