import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        int a, b, c;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while(true) {
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());

            if(a == 0) break;
            int maxVal = Math.max(Math.max(a, b), c);
            int leftVal = 0;
            leftVal = maxVal == a ? b + c :
                      maxVal == b ? a + c :
                      maxVal == c ? a + b : 0;
            if(maxVal >= leftVal) bw.write("Invalid\n");
            else {
                if(a == b && b == c) bw.write("Equilateral\n");
                else if(a == b && b != c || a == c && a != b || b == c && a != b) bw.write("Isosceles\n");
                else bw.write("Scalene\n");
            }
            bw.flush();
        }
        br.close();
        bw.close();
    }
}
