import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> nameMap = new HashMap<>();
        Map<Integer, String> rankMap = new TreeMap<>();

        for (int i = 0; i < players.length; i++) {
            nameMap.put(players[i], i);
            rankMap.put(i, players[i]);
        }

        for(String s : callings) {
            int rank = nameMap.get(s);
            nameMap.put(s, rank - 1);
            String name = rankMap.get(rank - 1);
            nameMap.put(name, rank);
            rankMap.put(rank - 1, s);
            rankMap.put(rank, name);
        }
        
        return rankMap.values().toArray(new String[players.length]);
    }
}