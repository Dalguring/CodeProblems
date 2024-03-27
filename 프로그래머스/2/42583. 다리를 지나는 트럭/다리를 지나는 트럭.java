import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int time = 0;
        int onBridgeWeight = 0;
        Queue<Integer> truckQueue = new LinkedList<>(Arrays.stream(truck_weights)
                                                     .boxed()
                                                     .collect(Collectors.toList()));
        Queue<Integer> bridgeQueue = new LinkedList<>();

        do {
            time++;
            if (time > bridge_length) {
                onBridgeWeight -= bridgeQueue.poll();
            }
            if (!truckQueue.isEmpty()) {
                if (bridgeQueue.size() < bridge_length) {
                    if (truckQueue.peek() + onBridgeWeight <= weight) {
                        int truckWeight = truckQueue.poll();
                        bridgeQueue.offer(truckWeight);
                        onBridgeWeight += truckWeight;
                    } else {
                        bridgeQueue.offer(0);
                    }
                }
            }
        } while (!bridgeQueue.isEmpty());
        
        return time;
    }
}