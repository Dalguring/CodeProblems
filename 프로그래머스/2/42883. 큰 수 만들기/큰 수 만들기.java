class Solution {
    public String solution(String number, int k) {
        StringBuilder sb = new StringBuilder();
        int index = 0;
        int toGet = number.length() - k;

        for (int i = 0; i < toGet; i++) {
            int maxIndex = index;

            for (int j = index; j <= k + i; j++) {
                if (number.charAt(j) > number.charAt(maxIndex)) {
                    maxIndex = j;
                }
            }

            sb.append(number.charAt(maxIndex));
            index = maxIndex + 1;
        }
        
        return sb.toString();
    }
}