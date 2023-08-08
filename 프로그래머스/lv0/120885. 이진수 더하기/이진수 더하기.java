class Solution {
    public String solution(String bin1, String bin2) {
        StringBuilder sb = new StringBuilder(bin1);
        sb.reverse();

        int sum = 0;
        for (int i = 0; i < sb.length(); i++) {
            sum += Character.getNumericValue(sb.charAt(i)) * Math.pow(2, (double) i);
        }
        sb = new StringBuilder(bin2);
        sb.reverse();

        for (int i = 0; i < sb.length(); i++) {
            sum += Character.getNumericValue(sb.charAt(i)) * Math.pow(2, (double) i);
        }

        return Integer.toBinaryString(sum);
    }
}