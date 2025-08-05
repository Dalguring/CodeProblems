import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] switchStatus;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int switches = Integer.parseInt(br.readLine());
        switchStatus = new int[switches];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < switches; i++) {
            switchStatus[i] = Integer.parseInt(st.nextToken());
        }

        int students = Integer.parseInt(br.readLine());

        for (int i = 0; i < students; i++) {
            st = new StringTokenizer(br.readLine());

            int gender = Integer.parseInt(st.nextToken());
            int standard = Integer.parseInt(st.nextToken());

            controlSwitches(gender, standard);
        }

        for (int i = 0; i < switches; i++) {
            sb.append(switchStatus[i]).append(" ");
            if ((i + 1) % 20 == 0) {
                sb.append("\n");
            }
        }

        System.out.print(sb);
        br.close();
    }

    static void controlSwitches(int gender, int standard) {
        if (gender == 1) {
            for (int i = standard - 1; i < switchStatus.length; i += standard) {
                switchStatus[i] = switchStatus[i] == 1 ? 0 : 1;
            }
        } else {
            int left = standard - 2;
            int right = standard;
            switchStatus[standard - 1] = switchStatus[standard - 1] == 1 ? 0 : 1;

            while (left >= 0 && right < switchStatus.length && switchStatus[left] == switchStatus[right]) {
                switchStatus[left] = switchStatus[left] == 1 ? 0 : 1;
                switchStatus[right] = switchStatus[right] == 1 ? 0 : 1;
                left--;
                right++;
            }
        }
    }
}
