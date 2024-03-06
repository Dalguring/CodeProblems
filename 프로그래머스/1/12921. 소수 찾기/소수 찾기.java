class Solution {
    public int solution(int n) {
        int answer = 0;
        boolean[] primeArray = new boolean[n + 1];
        primeArray[0] = true;
        primeArray[1] = true;

        for (int i = 2; i < Math.sqrt(primeArray.length); i++) {
            if (!primeArray[i]) {
                for (int j = i * i; j < primeArray.length; j += i) {
                    primeArray[j] = true;
                }
            }
        }

        for (boolean b : primeArray) {
            if (!b) {
                answer++;
            }
        }
        
        return answer;
    }
}