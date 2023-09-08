class Solution {
    public int solution(String s) {
        int answer = 0;
        answer = split(s, answer);
        
        return answer;
    }
    
    static int split(String s, int answer) {
        int same = 0;
        int diff = 0;
        char c = s.charAt(0);
        int index = 0;

        for (char target : s.toCharArray()) {
            if (target == c)
                same++;
            else diff++;
            index++;

            if (index == s.length()) {
                answer++;
                return answer;
            }
            if (same == diff) {
                answer++;
                return split(s.substring(index), answer);
            }
        }

        return 1;
    }
}