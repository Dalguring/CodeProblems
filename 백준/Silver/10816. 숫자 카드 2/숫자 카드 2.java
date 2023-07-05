import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        StringTokenizer st = new StringTokenizer(br.readLine());
        Map<Integer, Integer> cardMap = new HashMap<>();

        while(st.hasMoreTokens()) {
            int key = Integer.parseInt(st.nextToken());
            if(cardMap.containsKey(key)) cardMap.put(key, cardMap.get(key) + 1);
            else cardMap.put(key, cardMap.getOrDefault(key, 0) + 1);
        }

        br.readLine();
        st = new StringTokenizer(br.readLine());
        br.close();
        StringBuilder sb = new StringBuilder();
        while(st.hasMoreTokens()) {
            int target = Integer.parseInt(st.nextToken());
            sb.append(cardMap.getOrDefault(target, 0)).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}

