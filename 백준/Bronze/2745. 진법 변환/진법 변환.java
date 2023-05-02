import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        String N = st.nextToken();
        StringBuilder sb = new StringBuilder();
        for(int i = N.length() - 1; i >= 0; i--) {
            sb.append(N.charAt(i));
        }
        int B = Integer.parseInt(st.nextToken());
        int total = 0;
        for(int i = 0; i < sb.length(); i++) {
            if(sb.charAt(i) > '9') {
                int temp = sb.charAt(i) - 'A' + 10;
                total += temp * Math.pow(B, i);
            } else {
                total += (sb.charAt(i) - '0') * Math.pow(B, i);
            }
        }
        System.out.println(total);
    }
}
