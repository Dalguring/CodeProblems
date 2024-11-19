import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] s1 = br.readLine().split(" ");
        String[] s2 = br.readLine().split(" ");

        Date birth = new Date(
                Integer.parseInt(s1[0]),
                Integer.parseInt(s1[1]),
                Integer.parseInt(s1[2])
        );

        Date standard = new Date(
                Integer.parseInt(s2[0]),
                Integer.parseInt(s2[1]),
                Integer.parseInt(s2[2])
        );

        int yearGap = standard.getYear() - birth.getYear();
        int monthGap = standard.getMonth() - birth.getMonth();
        int dateGap = standard.getDate() - birth.getDate();

        if (yearGap == 0) {
            sb.append(yearGap).append("\n");
        } else if (monthGap < 0) {
            sb.append(yearGap - 1).append("\n");
        } else if (monthGap > 0) {
            sb.append(yearGap).append("\n");
        } else if (dateGap < 0) {
            sb.append(yearGap - 1).append("\n");
        } else {
            sb.append(yearGap).append("\n");
        }

        sb.append(yearGap + 1).append("\n").append(yearGap);

        System.out.println(sb);
        br.close();
    }
}

class Date {

    private final int year;
    private final int month;
    private final int date;

    public Date(int year, int month, int date) {
        this.year = year;
        this.month = month;
        this.date = date;
    }

    public int getYear() {
        return this.year;
    }

    public int getMonth() {
        return this.month;
    }

    public int getDate() {
        return this.date;
    }

}
