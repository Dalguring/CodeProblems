class Solution {
    public String solution(int n, int t, int m, int p) {
        StringBuilder sb = new StringBuilder();
        int num = 0;
        StringBuilder answer = new StringBuilder();

        while (t * m > sb.length()) {
            sb.append(Integer.toString(num, n));
            num++;
        }

        for (int i = 0; i < t; i++) {
            answer.append(sb.charAt(m * i + p - 1));
        }

        return answer.toString().toUpperCase();
    }
}