import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    static final String[] hexagon = {"red", "orange", "yellow", "green", "blue", "purple"};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int testcase = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < testcase; tc++) {
            st = new StringTokenizer(br.readLine());

            int index1 = getIndex(st.nextToken());
            int index2 = getIndex(st.nextToken());

            switch (Math.abs(index1 - index2)) {
                case 0:
                    sb.append("E"); break;
                case 1:
                case 5:
                    sb.append("A"); break;
                case 2:
                case 4:
                    sb.append("X"); break;
                case 3:
                    sb.append("C"); break;
            }

            sb.append("\n");
        }

        System.out.println(sb);
        br.close();
    }

    static int getIndex(String color) {
        for (int i = 0; i < hexagon.length; i++) {
            if (hexagon[i].equals(color)) {
                return i;
            }
        }

        return 0;
    }
}