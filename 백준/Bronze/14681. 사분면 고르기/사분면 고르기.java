import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean xAxis = Integer.parseInt(br.readLine()) > 0;
        boolean yAxis = Integer.parseInt(br.readLine()) > 0;
        boolean[] quadrant = new boolean[]{xAxis, yAxis};

        if (quadrant[0]) {
            if (quadrant[1]) System.out.println(1);
            else             System.out.println(4);
        } else {
            if (quadrant[1]) System.out.println(2);
            else             System.out.println(3);
        }
        br.close();
    }
}
