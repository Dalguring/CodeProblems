import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        Arrays.sort(stages);
        Queue<Integer> stageQueue = new LinkedList<>();
        Map<Integer, Double> stageMap = new HashMap<>();

        for (int stage : stages) {
            stageQueue.add(stage);
        }
        for (int i = 1; i <= N; i++) {
            int count = 0;
            double size = stageQueue.size() == 0 ? 1.0 : stageQueue.size();

            while (stageQueue.contains(i)) {
                stageQueue.poll();
                count++;
            }
            stageMap.put(i, count / size);
        }
        
        List<Integer> stageList = new ArrayList<>(stageMap.keySet());
        stageList.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return stageMap.get(o2).compareTo(stageMap.get(o1));
            }
        });
        
        return stageList.stream().mapToInt(Integer::intValue).toArray();
    }
}