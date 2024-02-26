class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String [] answer = new String[n];
        int[] bitMap = new int[n];

        for (int i = 0; i < n; i++) {
            bitMap[i] = arr1[i] | arr2[i];
            answer[i] = fillMap(bitMap[i], n);
        }
        
        return answer;
    }
    
    static String fillMap(int target, int size) {
        int tLength = Integer.toBinaryString(target).length();
        String binaryString = "";

        if (size > tLength) {
             binaryString = "0".repeat(size - tLength).concat(Integer.toBinaryString(target));
        } else {
            binaryString = Integer.toBinaryString(target);
        }

        return binaryString.replaceAll("1", "#").replaceAll("0", " ");
    }
}