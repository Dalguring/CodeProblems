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
        StringTokenizer st = null;
        List<Integer> xList = new ArrayList<>();
        List<Integer> yList = new ArrayList<>();
        for(int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            xList.add(Integer.parseInt(st.nextToken()));
            yList.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(xList);
        Collections.sort(yList);
        StringBuilder sb = new StringBuilder();
        if(xList.get(0).equals(xList.get(1))) sb.append(xList.get(2) + " ");
        else sb.append(xList.get(0) + " ");
        if(yList.get(0).equals(yList.get(1))) sb.append(yList.get(2));
        else sb.append(yList.get(0));

        System.out.println(sb);
    }
}
