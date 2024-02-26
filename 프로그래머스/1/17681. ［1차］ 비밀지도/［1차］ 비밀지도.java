class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            int length1 = Integer.toBinaryString(arr1[i]).length();
            int length2 = Integer.toBinaryString(arr2[i]).length();
            String string1 = "";
            String string2 = "";

            if (n > length1) {
                string1 = "0".repeat(n - length1).concat(Integer.toBinaryString(arr1[i]));
            } else {
                string1 = Integer.toBinaryString(arr1[i]);
            }
            if (n > length2) {
                string2 = "0".repeat(n - length2).concat(Integer.toBinaryString(arr2[i]));
            } else {
                string2 = Integer.toBinaryString(arr2[i]);
            }

            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < n; j++) {
                if (string1.charAt(j) != '0' || string2.charAt(j) != '0') {
                    sb.append("#");
                } else {
                    sb.append(" ");
                }
            }
            answer[i] = sb.toString();
        }
        
        return answer;
    }
}