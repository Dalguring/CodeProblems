import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int encyclopedia = Integer.parseInt(st.nextToken());
        int toCorrect = Integer.parseInt(st.nextToken());

        Map<String, Integer> pocketmonMap = new HashMap<>(encyclopedia);
        String[] names = new String[encyclopedia + 1];
        
        for (int i = 1; i <= encyclopedia; i++) {
            String input = br.readLine();
            pocketmonMap.put(input, i);
            names[i] = input;
        }

        for (int i = 0; i < toCorrect; i++) {
            String input = br.readLine();
            if (!Character.isDigit(input.charAt(0))) {
                bw.write(pocketmonMap.get(input) + "\n");
                bw.flush();
            } else {
                bw.write(names[Integer.parseInt(input)] + "\n");
                bw.flush();
            }
        }
        br.close();
        bw.close();
    }
}

