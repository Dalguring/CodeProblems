class Solution {
    public int solution(int a, int b) {
        String result1 = a + "" + b;
        String result2 = 2 * a * b + "";

        if(Integer.parseInt(result1) >= Integer.parseInt(result2)) {
            return Integer.valueOf(result1);
        } else {
            return Integer.valueOf(result2);
        }
    }
}