import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        Time time = new Time(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        int setTime = Integer.parseInt(br.readLine());
        time.getAdjustTime(setTime);
        System.out.println(time.toString());

        br.close();
    }
}

class Time {
    private int hour;
    private int minute;

    public Time(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    public void getAdjustTime(int setTime) {
        int leftTime = (minute + (setTime % 60)) / 60;
        minute = (minute + (setTime % 60)) % 60;
        hour = (hour + (setTime / 60) + leftTime) % 24;
    }

    @Override
    public String toString() {
        return hour + " " + minute;
    }
}
