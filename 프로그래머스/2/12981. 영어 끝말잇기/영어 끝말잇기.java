import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n, String[] words) {
        int count = 1;
        boolean isDropout = false;
        List<String> list = new ArrayList<>();
        char c = words[0].charAt(words[0].length() - 1);
        list.add(words[0]);

        for (int i = 1; i < words.length; i++) {
            if (c != words[i].charAt(0) || list.contains(words[i])) {
                isDropout = true;
                break;
            }
            c = words[i].charAt(words[i].length() - 1);
            list.add(words[i]);
            count++;
        }

        int[] answer;
        if (!isDropout) {
            answer = new int[]{0, 0};
        } else {
            answer = new int[]{count % n + 1, count / n + 1};
        }

        return answer;
    }
}