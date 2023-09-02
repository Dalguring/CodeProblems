import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        Map<String, Integer> termsMap = new HashMap<>();
        StringTokenizer st;
        for (String term : terms) {
            st = new StringTokenizer(term);
            termsMap.put(st.nextToken(), Integer.parseInt(st.nextToken()));
        }

        List<Integer> list = new ArrayList<>();
        int caseNum = 1;
        for (String privacy : privacies) {
            st = new StringTokenizer(privacy);
            String[] strArr = st.nextToken().split("\\.");
            int[] dateArr = {Integer.parseInt(strArr[0]), Integer.parseInt(strArr[1]), Integer.parseInt(strArr[2])};
            String[] todayStr = today.split("\\.");
            int[] todayArr = {Integer.parseInt(todayStr[0]), Integer.parseInt(todayStr[1]), Integer.parseInt(todayStr[2])};
            int term = termsMap.get(st.nextToken());
            getValidTerm(dateArr, term);
            // 분기 처리
            if (dateArr[0] < todayArr[0])
                list.add(caseNum);
            else if (dateArr[0] == todayArr[0]) {
                if (dateArr[1] < todayArr[1])
                    list.add(caseNum);
                else if (dateArr[1] == todayArr[1]) {
                    if (dateArr[2] < todayArr[2])
                        list.add(caseNum);
                }
            }
            caseNum++;
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
    
    static int[] getValidTerm(int[] dateArr, int term) {
        // 일자 처리 부분
        if (dateArr[2] == 1) {
            dateArr[2] = 28;
            if (dateArr[1] == 1) {
                dateArr[1] = 12;
                dateArr[0] -= 1;
            } else dateArr[1] -= 1;
        }
        else dateArr[2] -= 1;

        // 월 처리 부분
        if (dateArr[1] + term > 12) {
            int target = dateArr[1] + term;
            if (target % 12 == 0) {
                dateArr[1] = 12;
                dateArr[0] -= 1;
            } else dateArr[1] = target % 12;
            dateArr[0] += target / 12;
        } else dateArr[1] += term;

        return dateArr;
    }
}