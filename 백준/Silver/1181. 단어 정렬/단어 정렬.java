import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();
        for (int i = 0; i < testCase; i++) {
            set.add(br.readLine());
        }
        br.close();
        List<String> list = new ArrayList<>(set);
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                } else
                    return o1.length() - o2.length();
            }
        });
        StringBuilder sb = new StringBuilder();
        for(String s : list)
            sb.append(s + "\n");
        System.out.println(sb);
    }
}
