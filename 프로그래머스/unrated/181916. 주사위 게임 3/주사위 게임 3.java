import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] arr = new int[]{a, b, c, d};
		int countA = 0;
		int countB = 0;
		int countC = 0;
		int countD = 0;
        
		Set<Integer> set = new LinkedHashSet<>();
        
		for(int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
			if(a == arr[i]) countA++;
			if(b == arr[i]) countB++;
			if(c == arr[i]) countC++;
			if(d == arr[i]) countD++;
		}
        
		Integer[] setArr = set.toArray(new Integer[0]);

		if(set.size() == 1) 
            return 1111 * setArr[0];
		else if(set.size() == 2 && countA == 1)
			return a == setArr[0] ? (int)(Math.pow(10 * setArr[1] + setArr[0], 2)) :
                                    (int)(Math.pow(10 * setArr[0] + setArr[1], 2));
        else if(set.size() == 2 && countA == 3)
            return a == setArr[0] ? (int)(Math.pow(10 * setArr[0] + setArr[1], 2)) :
                                    (int)(Math.pow(10 * setArr[1] + setArr[0], 2));
		else if(set.size() == 2 && countA == 2) 
            return (setArr[0] + setArr[1]) * Math.abs(setArr[0] - setArr[1]);
		else if(set.size() == 3) 
            return countA == 2 && a == setArr[0] ? setArr[1] * setArr[2] :
                   countA == 2 && a == setArr[1] ? setArr[0] * setArr[2] :
                   countA == 2 && a == setArr[2] ? setArr[0] * setArr[1] :
			       countB == 2 && b == setArr[0] ? setArr[1] * setArr[2] :
                   countB == 2 && b == setArr[1] ? setArr[0] * setArr[2] :
                   countB == 2 && b == setArr[2] ? setArr[0] * setArr[1] :
                   countC == 2 && c == setArr[0] ? setArr[1] * setArr[2] :
                   countC == 2 && c == setArr[1] ? setArr[0] * setArr[2] :
                   countC == 2 && c == setArr[2] ? setArr[0] * setArr[1] :
                   countD == 2 && d == setArr[0] ? setArr[1] * setArr[2] :
                   countD == 2 && d == setArr[1] ? setArr[0] * setArr[2] :
                   countD == 2 && d == setArr[2] ? setArr[0] * setArr[1] : 0;
		else if(set.size() == 4) {
            Arrays.sort(setArr);
            return setArr[0];
        }
        return 0;
    }
}