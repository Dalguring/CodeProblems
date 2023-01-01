class Solution {
    public int solution(int order) {
        int answer = 0;
        String target = order+"";
        for(int i = 0; i < target.length(); i++) {
            switch(target.charAt(i)) {
                case '3' : answer++; continue;
                case '6' : answer++; continue;
                case '9' : answer++; continue;
            }
        }
        return answer;
    }
}