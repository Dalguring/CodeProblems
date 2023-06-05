class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        if(a != b && b != c && a != c) {
            answer = a + b + c;
        } else if(a == b && b == c) {
            answer = (a + b + c) * (a * a + b * b + c * c)
                                 * (a * a * a + b * b * b + c * c * c);
        } else if(a == b && b != c) {
            answer = (a + b + c) * (a * a + b * b + c * c);
        } else if(a == c && a != b) {
            answer = (a + b + c) * (a * a + b * b + c * c);
        } else if(b == c && a != b) {
            answer = (a + b + c) * (a * a + b * b + c * c);
        }
        return answer;
    }
}