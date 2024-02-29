import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        List<Integer> winningList = new LinkedList<>(Arrays.stream(win_nums).boxed().collect(Collectors.toList()));
        int match = 0;
        int maxMatch = 0;

        for (int i = 0; i < lottos.length; i++) {
            if (winningList.contains(lottos[i])) {
                winningList.remove(winningList.indexOf(lottos[i]));
                match++;
            }
        }

        int left = (int) Arrays.stream(lottos).filter(num -> num == 0).count();
        maxMatch = Math.min(match + Math.min(left, winningList.size()), 6);
        
        return new int[]{getRank(maxMatch), getRank(match)};
    }
    
    private static int getRank(int number) {
        switch (number) {
            case 0: case 1:
                return 6;
            case 2:
                return 5;
            case 3:
                return 4;
            case 4:
                return 3;
            case 5:
                return 2;
            case 6:
                return 1;
            default:
                return 0;
        }
    }
}