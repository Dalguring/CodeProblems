import java.util.LinkedList;
import java.util.Queue;

class Solution {
    private final static Queue<String> cityQueue = new LinkedList<>();
    private static int runtime = 0;
    private static int currentCacheSize = 0;
    
    public int solution(int cacheSize, String[] cities) {
        if (cacheSize == 0) {
            return cities.length * 5;
        }
        
        int cityIndex = 0;

        while (currentCacheSize != cacheSize) {
            String city = cities[cityIndex].toLowerCase();

            if (isNewCity(city, cacheSize)) {
                currentCacheSize++;
            }
            cityIndex++;
        }

        for (int i = cityIndex; i < cities.length; i++) {
            String city = cities[i].toLowerCase();
            isNewCity(city, cacheSize);
        }
        
        return runtime;
    }
    
    static boolean isNewCity(String city, int cacheSize) {
        if (cityQueue.isEmpty() || !cityQueue.contains(city)) {
            if (currentCacheSize == cacheSize) {
                cityQueue.poll();
            }
            cityQueue.offer(city);
            runtime += 5;

            return true;
        } else {
            cityQueue.remove(city);
            cityQueue.offer(city);
            runtime += 1;

            return false;
        }
    }
}