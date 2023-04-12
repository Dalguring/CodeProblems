import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] charArr1 = new char[5][15];

        for(int i = 0; i < charArr1.length; i++) {
            char[] charStore = br.readLine().toCharArray();
            for(int j = 0; j < charArr1[i].length; j++) {
                if(j < charStore.length) {
                    charArr1[i][j] = charStore[j];
                } else {
                    charArr1[i][j] = ' ';
                }
            }
        }
        br.close();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < 15; i++) {
            for(int j = 0; j < charArr1.length; j++) {
                if(charArr1[j][i] == ' ') continue;
                else sb.append(charArr1[j][i]);
            }
        }
        System.out.println(sb.toString());
    }
}
