import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        
        report = Arrays.stream(report).distinct().toArray(String[]::new);
        // 이메일 받은 횟수 저장할 Map 객체
        Map<String, Integer> mailMap = new LinkedHashMap<>();
        // 피고:신고인 저장할 Map 객체
        Map<String, Set<String>> reportMap = new HashMap<>();

        for (String id : id_list) {
            mailMap.put(id, 0);
        }
        for (String rep : report) {
            String defendant = rep.split(" ")[1];
            String reporter = rep.split(" ")[0];

            if (!reportMap.containsKey(defendant)) {
                reportMap.put(defendant, new HashSet<>());
            }
            reportMap.get(defendant).add(reporter);
        }

        for (String defendant : reportMap.keySet()) {
            if (reportMap.get(defendant).size() >= k) {
                reportMap.get(defendant)
                        .forEach(reporter -> mailMap.put(reporter, mailMap.getOrDefault(reporter, 0) + 1));
            }
        }
        
        return mailMap.values()
                .stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}