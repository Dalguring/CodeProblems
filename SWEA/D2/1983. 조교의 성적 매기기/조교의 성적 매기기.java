import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int testcase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testcase; i++) {
            st = new StringTokenizer(br.readLine());
            int students = Integer.parseInt(st.nextToken());
            int target = Integer.parseInt(st.nextToken());
            int duplicationScore = students / 10;
            Map<Integer, Double> studentScoreMap = new HashMap<>();

            for (int j = 1; j <= students; j++) {
                String[] scores = br.readLine().split(" ");
                double finalScore = Double.parseDouble(scores[0]) * 0.35
                        + Double.parseDouble(scores[1]) * 0.45
                        + Double.parseDouble(scores[2]) * 0.2;

                studentScoreMap.put(j, finalScore);
            }

            List<Integer> keySet = new ArrayList<>(studentScoreMap.keySet());
            keySet.sort(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return studentScoreMap.get(o2).compareTo(studentScoreMap.get(o1));
                }
            });

            int index = (int) Math.ceil(((double) keySet.indexOf(target) + 1) / duplicationScore);
            String grade = "";

            switch (index) {
                case 1:
                    grade = "A+"; break;
                case 2:
                    grade = "A0"; break;
                case 3:
                    grade = "A-"; break;
                case 4:
                    grade = "B+"; break;
                case 5:
                    grade = "B0"; break;
                case 6:
                    grade = "B-"; break;
                case 7:
                    grade = "C+"; break;
                case 8:
                    grade = "C0"; break;
                case 9:
                    grade = "C-"; break;
                case 10:
                    grade = "D0"; break;
            }

            sb.append(String.format("#%d %s", i + 1, grade)).append("\n");
        }

        System.out.println(sb);
        br.close();
    }
}