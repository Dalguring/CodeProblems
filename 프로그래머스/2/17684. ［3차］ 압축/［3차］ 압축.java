import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String msg) {
        
        Map<String, Integer> lzwMap = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= 26; i++) {
            lzwMap.put(String.valueOf((char)('A' - 1 + i)), i);
        }

        int leftPointer = 0;
        int rightPointer = 1;
        boolean isValid = true;

        while (isValid) {
            while (lzwMap.containsKey(msg.substring(leftPointer, rightPointer))) {
                rightPointer++;

                if (rightPointer > msg.length()) {
                    sb.append(lzwMap.get(msg.substring(leftPointer, rightPointer - 1)));
                    isValid = false;
                    break;
                }
            }

            if (isValid) {
                lzwMap.put(msg.substring(leftPointer, rightPointer), lzwMap.size() + 1);
                sb.append(lzwMap.get(msg.substring(leftPointer, rightPointer - 1))).append(" ");
                leftPointer = rightPointer - 1;
            }
        }

        int[] answer = new int[sb.toString().split(" ").length];

        for (int i = 0; i < sb.toString().split(" ").length; i++) {
            answer[i] = Integer.parseInt(sb.toString().split(" ")[i]);
        }
        
        return answer;
    }
}