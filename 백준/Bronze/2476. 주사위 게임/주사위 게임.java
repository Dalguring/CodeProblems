import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int people = Integer.parseInt(br.readLine());
        int prizeMoney = 0;
        StringTokenizer st;
        Map<Integer, Integer> diceMap;

        for (int i = 0; i < people; i++) {
            diceMap = new TreeMap<>(Collections.reverseOrder());
            st = new StringTokenizer(br.readLine());

            while (st.hasMoreTokens()) {
                int dice = Integer.parseInt(st.nextToken());
                diceMap.put(dice, diceMap.getOrDefault(dice, 0) + 1);
            }

            Iterator<Integer> keys = diceMap.keySet().iterator();

            switch(diceMap.size()) {
                case 1: prizeMoney = Math.max(prizeMoney, 10000 + keys.next() * 1000); break;
                case 2: 
                    int first = keys.next();
                    int second = keys.next();

                    if (diceMap.get(first) == 2) {
                        prizeMoney = Math.max(prizeMoney, 1000 + first * 100);
                    } else {
                        prizeMoney = Math.max(prizeMoney, 1000 + second * 100);
                    }
                    break;
                case 3: prizeMoney = Math.max(prizeMoney, keys.next() * 100); break;
                default: prizeMoney = 0; break;
            }
        }

        System.out.println(prizeMoney);
        br.close();
    }
}
