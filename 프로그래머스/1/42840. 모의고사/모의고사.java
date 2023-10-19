import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] first = {1, 2, 3, 4, 5};
        int[] second = {2, 1, 2, 3, 2, 4 ,2, 5};
        int[] third = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] correct = new int[3];

        correct[0] = first[0] == answers[0] ? 1 : 0;
        correct[1] = second[0] == answers[0] ? 1 : 0;
        correct[2] = third[0] == answers[0] ? 1 : 0;

        for (int i = 1; i < answers.length; i++) {
            if (answers[i] == first[i % first.length])
                correct[0]++;
            if (answers[i] == second[i % second.length])
                correct[1]++;
            if (answers[i] == third[i % third.length])
                correct[2]++;
        }
        
        int max = Math.max(correct[0], Math.max(correct[1], correct[2]));
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < correct.length; i++) {
            if (correct[i] == max)
                list.add(i + 1);
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
