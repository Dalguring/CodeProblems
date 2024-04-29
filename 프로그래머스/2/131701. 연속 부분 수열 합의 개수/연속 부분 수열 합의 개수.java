import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

class Solution {
    static int[] dbElements;
    static final Set<Integer> elementSet = new HashSet<>();
    
    public int solution(int[] elements) {
        dbElements = new int[elements.length * 2];

        for (int i = 0; i < elements.length; i++) {
            dbElements[i] = elements[i];
            dbElements[i + elements.length] = elements[i];
            elementSet.add(elements[i]);
        }

        elementSet.add(IntStream.of(elements).sum());

        for (int i = 2; i <= elements.length - 1; i++) {
            getElementSum(i);
        }
        
        return elementSet.size();
    }
    
    static void getElementSum(int length) {
        for (int i = 0; i < dbElements.length / 2; i++) {
            int sum = 0;
            for (int j = i; j < i + length; j++) {
                sum += dbElements[j];
            }

            elementSet.add(sum);
        }
    }
}