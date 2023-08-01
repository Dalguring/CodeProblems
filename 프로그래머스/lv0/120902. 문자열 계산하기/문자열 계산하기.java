import java.util.*;

class Solution {
    public int solution(String my_string) {
        StringTokenizer st = new StringTokenizer(my_string);
        List<Integer> numList = new ArrayList<>();
        List<String> operatorList = new ArrayList<>();

        while (st.hasMoreTokens()) {
            String s = st.nextToken();
            if(s.matches("^[0-9]+"))
                numList.add(Integer.parseInt(s));
            else
                operatorList.add(s);
        }

        int answer = numList.get(0);
        for(int i = 0; i < operatorList.size(); i++) {
            if(operatorList.get(i).equals("+")) {
                answer = answer + numList.get(i + 1);
            } else {
                answer = answer - numList.get(i + 1);
            }
        }
        
        return answer;
    }
}