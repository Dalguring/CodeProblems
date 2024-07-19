import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        Map<String, String> idNickMap = new HashMap<>();
        List<String> history = new ArrayList<>();
        StringTokenizer st;

        for (String log : record) {
            st = new StringTokenizer(log);
            String delim = st.nextToken();
            String uid = st.nextToken();

            switch (delim) {
                case "Enter" -> {
                    idNickMap.put(uid, st.nextToken());
                    history.add("E ".concat(uid));
                }
                case "Leave" -> history.add("L ".concat(uid));
                case "Change" -> idNickMap.put(uid, st.nextToken());
            }
        }

        String[] answer = new String[history.size()];

        for (int i = 0; i < answer.length; i++) {
            st = new StringTokenizer(history.get(i));
            String delim = st.nextToken();
            String uid = st.nextToken();

            switch (delim) {
                case "E" -> {
                    answer[i] = idNickMap.get(uid).concat("님이 들어왔습니다.");
                }
                case "L" -> {
                    answer[i] = idNickMap.get(uid).concat("님이 나갔습니다.");
                }
            }
        }
        
        return answer;
    }
}