import java.util.*;

class Solution {
    public int[] solution(String s) {
        StringTokenizer st = new StringTokenizer(s, "{");
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        List<int[]> numList = new ArrayList<>();

        while (st.hasMoreTokens()) {
            String[] nums = st.nextToken()
                    .replaceAll("[,}]", " ")
                    .trim()
                    .split(" ");

            numList.add(Arrays.stream(nums)
                    .mapToInt(Integer::parseInt)
                    .toArray());
        }

        numList.sort((o1, o2) -> (o1.length - o2.length));
        numList.forEach(array -> {
            Arrays.stream(array)
                    .forEach(linkedHashSet::add);
        });

        return linkedHashSet.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}