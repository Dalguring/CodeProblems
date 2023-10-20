import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] attendNum = new int[28];
        boolean[] attended = new boolean[30];

        for (int i = 0; i < attendNum.length; i++)
            attendNum[i] = Integer.parseInt(br.readLine());
        
        br.close();
        StringBuilder sb = new StringBuilder();
        for (int number : attendNum) {
            attended[number - 1] = true;
        }

        for (int i = 0; i < attended.length; i++) {
            if (!attended[i])
                sb.append(i + 1).append("\n");
        }

        System.out.println(sb);
    }
}