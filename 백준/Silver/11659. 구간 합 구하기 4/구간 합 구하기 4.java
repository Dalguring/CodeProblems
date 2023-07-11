import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int numCount = Integer.parseInt(st.nextToken());
        int sumCount = Integer.parseInt(st.nextToken());

        int[] numArr = new int[numCount + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i < numArr.length; i++) {
            numArr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i < numArr.length; i++) {
            numArr[i] = numArr[i - 1] + numArr[i];
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < sumCount; i++) {
            st = new StringTokenizer(br.readLine());
            sb.append(Math.abs(numArr[Integer.valueOf(st.nextToken()) - 1] - numArr[Integer.valueOf(st.nextToken())]) + "\n");
        }
        br.close();
        System.out.println(sb);
    }
}

