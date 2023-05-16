import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int comeAndGo = Integer.parseInt(br.readLine());
        Set<String> personList = new HashSet<>();

        for (int i = 0; i < comeAndGo; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String enterOrLeave = st.nextToken();
            personList.add(name);
            if(enterOrLeave.equals("leave")) personList.remove(name);
        }
        br.close();
        List<String> list = new ArrayList<>(personList);
        Collections.sort(list, Collections.reverseOrder());
        for (String s : list) {
            System.out.println(s);
        }
    }
}
