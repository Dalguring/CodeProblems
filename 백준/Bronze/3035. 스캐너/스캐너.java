import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int ZR = Integer.parseInt(st.nextToken());
        int ZC = Integer.parseInt(st.nextToken());

        for (int i = 0; i < R; i++) {
            StringBuilder sub = new StringBuilder();
            String newspaper = br.readLine();

            for (char c : newspaper.toCharArray()) {
                sub.append(String.valueOf(c).repeat(ZC));
            }
            for (int j = 0; j < ZR; j++) {
                sb.append(sub).append("\n");
            }
        }

        System.out.println(sb);
        
        br.close();
    }
}
