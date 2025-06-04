import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int[] card;
    static int standard;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cards = Integer.parseInt(st.nextToken());
        standard = Integer.parseInt(st.nextToken());
        card = new int[cards];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < cards; i++) {
            card[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(card);
        int margin = getMarginalIndex(0,cards - 1);
        int max = 0;

        for (int i = 0; i <= margin - 2; i++) {
            for (int j = i + 1; j <= margin - 1; j++) {
                for (int k = j + 1; k <= margin; k++) {
                    int sum = card[i] + card[j] + card[k];

                    if (sum <= standard) {
                        max = Math.max(max, sum);
                    }
                }
            }
        }

        System.out.println(max);
        br.close();
    }

    private static int getMarginalIndex(int left, int right) {
        int result = -1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (card[mid] <= standard) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result == -1 ? 0 : result;
    }
}
