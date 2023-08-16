class Solution {
    public int solution(String A, String B) {
        String doubleA = A.concat(A);
        int answer = 0;
        for (int i = A.length(); i > 0; i--) {
            if(doubleA.substring(i, i + A.length()).equals(B))
                return answer;
            answer++;
        }
        return -1;
    }
}