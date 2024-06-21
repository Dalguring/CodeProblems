import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            String ymd = br.readLine();
            sb.append(String.format("#%d ", i + 1));

            if (validCheck(ymd)) {
                sb.append(String.format("%s/%s/%s", ymd.substring(0, 4), ymd.substring(4, 6), ymd.substring(6)))
                        .append("\n");
            } else {
                sb.append("-1").append("\n");
            }
        }

        System.out.println(sb);
    }

    private static boolean validCheck(String ymd) {
        String month = ymd.substring(4, 6);
        String day = ymd.substring(6);

        if (month.startsWith("0")) {
            month = month.substring(1);
        }
        if (day.startsWith("0")) {
            day = day.substring(1);
        }

        if (Integer.parseInt(month) < 1 || Integer.parseInt(month) > 12) {
            return false;
        }

        int lastDay;
        switch (month) {
            case "1": 
            case "3":
            case "5":
            case "7": 
            case "8": 
            case "10":
            case "12":
                lastDay = 31; break;
            case "2" :
                lastDay = 28; break;
            default :
                lastDay = 30; break;
        };

        if (Integer.parseInt(day) < 1 || Integer.parseInt(day) > lastDay) {
            return false;
        }

        return true;
    }
}
