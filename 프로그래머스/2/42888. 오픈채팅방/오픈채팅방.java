import java.util.*;

class Solution {
    
    enum Action {
        Enter, Leave, Change
    }
    
    public String[] solution(String[] record) {
        Map<String, String> idNickMap = new HashMap<>();
        List<String> history = new ArrayList<>();

        for (String log : record) {
            String[] parts = log.split(" ");
            Action action = Action.valueOf(parts[0]);
            String uid = parts[1];

            switch (action) {
                case Enter -> {
                    idNickMap.put(uid, parts[2]);
                    history.add("Enter ".concat(uid));
                }
                case Leave -> history.add("Leave ".concat(uid));
                case Change -> idNickMap.put(uid, parts[2]);
            }
        }

        String[] answer = new String[history.size()];

        for (int i = 0; i < answer.length; i++) {
            String[] parts = history.get(i).split(" ");
            Action action = Action.valueOf(parts[0]);
            String uid = parts[1];

            StringBuilder sb = new StringBuilder(idNickMap.get(uid));

            switch (action) {
                case Enter -> sb.append("님이 들어왔습니다.");
                case Leave -> sb.append("님이 나갔습니다.");
            }

            answer[i] = sb.toString();
        }
        
        return answer;
    }
}