import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int card = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] cardList = new int[card];
        for (int i = 0; i < card; i++) {
            cardList[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(cardList);
        int target = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        br.close();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < target; i++) {
            int leftIndex = 0;
            int rightIndex = card - 1;
            int num = Integer.parseInt(st.nextToken());

            while(leftIndex <= rightIndex) {
                int midIndex = (leftIndex + rightIndex) / 2;
                if(num == cardList[midIndex]) {
                    sb.append("1 ");
                    break;
                } else if(num < cardList[midIndex]) {
                    rightIndex = midIndex - 1;
                } else if(num > cardList[midIndex]){
                    leftIndex = midIndex + 1;
                }
                if(leftIndex > rightIndex) {
                    sb.append("0 ");
                    break;
                }
            }
        }
        System.out.println(sb.toString().trim());


    }
}
