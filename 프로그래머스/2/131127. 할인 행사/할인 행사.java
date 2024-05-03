import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int days = 0;

        for (int i = 0; i <= discount.length - 10; i++) {
            Map<String, Integer> buyMap = new HashMap<>();
            String[] goods = Arrays.copyOfRange(discount, i, i + 10);

            for (int j = 0; j < want.length; j++) {
                buyMap.put(want[j], number[j]);
            }

            for (String product : goods) {
                if (buyMap.containsKey(product)) {
                    buyMap.put(product, buyMap.getOrDefault(product, 0) - 1);
                    if (buyMap.get(product) == 0) {
                        buyMap.remove(product);
                    }
                }
            }

            if (buyMap.size() == 0) {
                days++;
            }
        }
        
        return days;
    }
}