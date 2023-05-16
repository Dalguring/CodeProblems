import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int setCount = Integer.parseInt(st.nextToken());
        int testCount = Integer.parseInt(st.nextToken());

        Set setList = new HashSet();
        for (int i = 0; i < setCount; i++) {
            setList.add(br.readLine());
        }
        int count = 0;
        for (int i = 0; i < testCount; i++) {
            if(setList.contains(br.readLine())) count++;
        }
        br.close();

        System.out.println(count);
    }
}
