import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cards = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Map<Integer, Integer> cardMap = new HashMap<>();

        while(st.hasMoreTokens()) {
            int key = Integer.parseInt(st.nextToken());
            if(cardMap.containsKey(key)) cardMap.put(key, cardMap.get(key) + 1);
            else cardMap.put(key, cardMap.getOrDefault(key, 0) + 1);
        }

        int toCorrect = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        br.close();
        StringBuilder sb = new StringBuilder();
        while(st.hasMoreTokens()) {
            int target = Integer.parseInt(st.nextToken());
            if(!cardMap.containsKey(target))
                cardMap.put(target, 0);
            sb.append(cardMap.get(target) + " ");
        }
        System.out.println(sb.toString().trim());
    }
}

