import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int fruits = Integer.parseInt(st.nextToken());
        int snakeBird = Integer.parseInt(st.nextToken());
        int[] height = new int[fruits];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < height.length; i++) {
            height[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(height);
        int index = 0;

        while (index < fruits) {
            if (height[index] <= snakeBird) {
                snakeBird++;
                index++;
            } else {
                break;
            }
        }

        System.out.println(snakeBird);
        br.close();
    }
}
