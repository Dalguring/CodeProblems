import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        // 선물을 주고 받은 상대방과의 횟수를 계산하기 위한 Map
        Map<String, Map<String, Integer>> giveMap = new HashMap<>();
        // 선물 지수를 계산하기 위한 Map
        Map<String, Integer> giftIndices = new HashMap<>();
        // 다음 달에 받을 선물을 계산하기 위한 Map
        Map<String, Integer> receiveMap = new HashMap<>();

        for (String name : friends) {
            giveMap.put(name, new HashMap<>());
            receiveMap.put(name, 0);
            giftIndices.put(name, 0);
        }

        for (String giveReceive : gifts) {
            String givePerson = giveReceive.split(" ")[0];
            String receivedPerson = giveReceive.split(" ")[1];

            giveMap.get(givePerson).put(receivedPerson, giveMap.get(givePerson).getOrDefault(receivedPerson, 0) + 1);
            giftIndices.put(givePerson, giftIndices.getOrDefault(givePerson, 0) + 1);
            giftIndices.put(receivedPerson, giftIndices.getOrDefault(receivedPerson, 0) - 1);
        }

        for (String name : friends) {
            for (String givenPerson : friends) {
                if (name.equals(givenPerson)) {
                    continue;
                }

                int giveCount = giveMap.get(name).getOrDefault(givenPerson, 0);
                int receiveCount = 0;

                if (giveMap.get(givenPerson).containsKey(name)) {
                    receiveCount = giveMap.get(givenPerson).get(name);
                }

                if (giveCount > receiveCount) {
                    receiveMap.put(name, receiveMap.getOrDefault(name, 0) + 1);
                }

                if (giveCount == receiveCount) {
                    if (giftIndices.get(name) > giftIndices.get(givenPerson)) {
                        receiveMap.put(name, receiveMap.getOrDefault(name, 0) + 1);
                    }
                }
            };
        }

        int maxReceive = 0;
        for (String name : receiveMap.keySet()) {
            maxReceive = Math.max(receiveMap.get(name), maxReceive);
        }
        
        return maxReceive;
    }
}