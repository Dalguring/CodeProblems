import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer, Integer> scoreMap = new TreeMap<>(Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= 8; i++) {
            scoreMap.put(Integer.parseInt(br.readLine()), i);
        }

        int totalScore = 0;
        int index = 0;
        List<Integer> indexList = new ArrayList<>();

        for (int key : scoreMap.keySet()) {
            if (index > 4) {
                break;
            }

            totalScore += key;
            indexList.add(scoreMap.get(key));
            index++;
        }

        sb.append(totalScore).append("\n");
        Collections.sort(indexList);

        for (int idx : indexList) {
            sb.append(idx).append(" ");
        }

        System.out.println(sb);
        br.close();
    }
}
