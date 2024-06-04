import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] topping) {
        if (topping.length == 1) {
            return 0;
        }
        
        int count = 0;
        int[] cheolsoo = new int[topping.length];
        int[] brother = new int[topping.length];
        Set<Integer> toppingSet = new HashSet<>();

        for (int i = 0; i < topping.length; i++) {
            toppingSet.add(topping[i]);
            brother[i] = toppingSet.size();
        }

        toppingSet.clear();

        for (int i = topping.length - 1; i >= 0; i--) {
            toppingSet.add(topping[i]);
            cheolsoo[i] = toppingSet.size();
        }

        for (int i = 0; i < brother.length - 2; i++) {
            if (brother[i] == cheolsoo[i + 1]) {
                count++;
            }
            if (brother[i] > cheolsoo[i + 1]) {
                break;
            }
        }
        
        return count;
    }
}