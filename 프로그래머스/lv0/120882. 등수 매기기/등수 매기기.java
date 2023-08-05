import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        List<Double> list = new ArrayList<>();

        for(int[] i : score)
            list.add((i[0] + i[1]) / 2.0);

        Collections.sort(list, Comparator.reverseOrder());

        int[] answer = new int[score.length];

        for (int i = 0; i < list.size(); i++)
            answer[i] = list.indexOf((score[i][0] + score[i][1]) / 2.0) + 1;
        
        return answer;
    }
}