import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        double aSUmb = Double.parseDouble(st.nextToken());
        double aSUmc = Double.parseDouble(st.nextToken());
        double bSUmc = Double.parseDouble(st.nextToken());
        double totalRain = (aSUmb + aSUmc + bSUmc) / 2;

        if (totalRain - aSUmb <= 0 || totalRain - aSUmc <= 0 || totalRain - bSUmc <= 0) {
            System.out.println(-1);
            return;
        }

        System.out.println(String.format("1\n%.1f %.1f %.1f",
                totalRain - bSUmc, totalRain - aSUmc, totalRain - aSUmb));
        
        br.close();
    }
}
