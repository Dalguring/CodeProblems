import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        Map<String, Integer> totalMap = new HashMap<>();
        Map<String, List<Node>> descList = new HashMap<>();
        for (int i = 0; i < genres.length; i++) {
            totalMap.put(genres[i], totalMap.getOrDefault(genres[i], 0) + plays[i]);
            List<Node> list = descList.getOrDefault(genres[i], new ArrayList<>());
            list.add(new Node(i, plays[i]));
            descList.put(genres[i], list);
        }

        List<Map.Entry<String, Integer>> mapList = new LinkedList<>(totalMap.entrySet());
        mapList.sort(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < mapList.size(); i++) {
            String genre = mapList.get(i).getKey();
            List<Node> list = descList.get(genre);

            Collections.sort(list, (o1, o2) -> {
                if (o2.play == o1.play)
                    return o1.index - o2.index;
                else
                    return o2.play - o1.play;
            });

            result.add(list.get(0).index);
            if (list.size() > 1)
                result.add(list.get(1).index);
        }
        
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}

class Node {
    int index;
    int play;
    public Node(int index, int play) {
        this.index = index;
        this.play = play;
    }
}