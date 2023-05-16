import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int setCount = Integer.parseInt(st.nextToken());
        int testCount = Integer.parseInt(st.nextToken());

        List<String> setList = new ArrayList<>();
        List<String> testList = new ArrayList<>();

        for (int i = 0; i < setCount; i++) {
            setList.add(br.readLine());
        }
        for (int i = 0; i < testCount; i++) {
            testList.add(br.readLine());
        }
        br.close();
        Collections.sort(setList);
        Collections.sort(testList);
        int count = 0;
        for (int i = 0; i < testCount; i++) {
            if(setList.contains(testList.get(i))) count++;
        }

        System.out.println(count);
    }
}
