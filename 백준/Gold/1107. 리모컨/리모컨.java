import java.io.*;
import java.util.*;

public class Main {
    static boolean[] broken = new boolean[10];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int target = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        if (m > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            for (int i = 0; i < m; i++) {
                broken[Integer.parseInt(st.nextToken())] = true;
            }
        }

        int answer = Math.abs(target - 100);
        int offset = 0;
        
        while (offset <= answer) {
            if (target + offset <= 1000000) {
                int len = getChannelLength(target + offset);
                
                if (len > 0) {
                    int press = len + offset;
                    answer = Math.min(answer, press);
                }
            }

            if (offset > 0 && target - offset >= 0) {
                int len = getChannelLength(target - offset);
                
                if (len > 0) {
                    int press = len + offset;
                    answer = Math.min(answer, press);
                }
            }

            offset++;
        }

        System.out.println(answer);
    }

    static int getChannelLength(int channel) {
        if (channel == 0) {
            return broken[0] ? 0 : 1;
        }

        int len = 0;
        
        while (channel > 0) {
            if (broken[channel % 10]) {
                return 0;
            }
            
            len++;
            channel /= 10;
        }
        
        return len;
    }
}