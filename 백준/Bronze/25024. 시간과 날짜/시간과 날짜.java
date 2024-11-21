import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            sb.append(checkTime(x, y)).append(" ").append(checkDate(x, y)).append("\n");
        }

        System.out.println(sb);
        br.close();
    }

    static String checkTime(int hour, int minute) {
        boolean isTime = hour >= 0 && hour <= 23 && minute >= 0 && minute <=59;

        return isTime ? "Yes" : "No";
    }

    static String checkDate(int month, int date) {
        boolean isMonth = month >= 1 && month <=12;

        if (!isMonth) {
            return "No";
        }

        int maxDate = 0;

        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                maxDate = 31;
                break;
            case 4: case 6: case 9: case 11:
                maxDate = 30;
                break;
            case 2:
                maxDate = 29;
                break;
        }

        return date <= maxDate && date > 0 ? "Yes" : "No";
    }
}
