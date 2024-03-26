import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        List<Map<String, Integer>> dataSet = new ArrayList<>();
        int rangeIndex = switch (ext) {
            case "code" -> 0;
            case "date" -> 1;
            case "maximum" -> 2;
            case "remain" -> 3;
            default -> -1;
        };

        for (int[] datum : data) {
            if (datum[rangeIndex] < val_ext) {
                Map<String, Integer> map = new HashMap<>();
                map.put("code", datum[0]);
                map.put("date", datum[1]);
                map.put("maximum", datum[2]);
                map.put("remain", datum[3]);

                dataSet.add(map);
            }
        }

        dataSet.sort((o1, o2) -> {
            return o1.get(sort_by).compareTo(o2.get(sort_by));
        });

        int[][] answer = new int[dataSet.size()][4];

        for (int i = 0; i < answer.length; i++) {
            answer[i][0] = dataSet.get(i).get("code");
            answer[i][1] = dataSet.get(i).get("date");
            answer[i][2] = dataSet.get(i).get("maximum");
            answer[i][3] = dataSet.get(i).get("remain");
        }
        
        return answer;
    }
}