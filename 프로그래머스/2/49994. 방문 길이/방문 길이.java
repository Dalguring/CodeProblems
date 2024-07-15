import java.util.*;

class Solution {
    public int solution(String dirs) {
        Set<String> visitList = new HashSet<>();
        Map<Character, int[]> directionMap = new HashMap<>();
        
        directionMap.put('U', new int[]{0, 1});
        directionMap.put('R', new int[]{1, 0});
        directionMap.put('D', new int[]{0, -1});
        directionMap.put('L', new int[]{-1, 0});

        int x = 5;
        int y = 5;
        int move = 0;

        for (char dir : dirs.toCharArray()) {
            int dx = directionMap.get(dir)[0];
            int dy = directionMap.get(dir)[1];

            if (x + dx < 0 || x + dx > 10 || y + dy < 0 || y + dy > 10) {
                continue;
            }

            if (visitList.contains("" + x + y + (x + dx) + (y + dy))
                    || visitList.contains("" + (x + dx) + (y + dy) + x + y)) {
                x = x + dx;
                y = y + dy;

                continue;
            }

            visitList.add("" + x + y + (x + dx) + (y + dy));
            visitList.add("" + (x + dx) + (y + dy) + x + y);

            x += dx;
            y += dy;

            move++;
        }
        
        return move;
    }
}