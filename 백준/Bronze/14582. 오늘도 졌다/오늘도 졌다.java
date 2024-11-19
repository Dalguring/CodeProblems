import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] integration = new int[9 * 2];
        String[] score1 = br.readLine().split(" ");
        String[] score2 = br.readLine().split(" ");

        for (int i = 0; i < integration.length; i++) {
            if (i % 2 == 0) {
                integration[i] = Integer.parseInt(score1[i / 2]);
            } else {
                integration[i] = Integer.parseInt(score2[i / 2]);
            }
        }

        int gradiantScore = 0;
        boolean anyWin = false;

        for (int i = 0; i < integration.length; i++) {
            gradiantScore += i % 2 == 0 ? integration[i] : -integration[i];
            if (gradiantScore > 0) {
                anyWin = true;
                break;
            }
        }

        if (anyWin) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        br.close();
    }
}
