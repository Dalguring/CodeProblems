import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] array = new int[N];
        int[] result = new int[N];
        int max = Integer.MIN_VALUE;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(br.readLine());
            max = Math.max(array[i], max);
        }
        int[] countingSort = new int[max + 1];
        br.close();
        for (int i = 0; i < array.length; i++)
            countingSort[array[i]]++;

        // 누적합 구하기
        for (int i = 1; i < countingSort.length; i++)
            countingSort[i] += countingSort[i - 1];

        for (int i = array.length - 1; i >= 0; i--) {
            int value = array[i];
            countingSort[value]--;
            result[countingSort[value]] = value;
        }

        for (int i = 0; i < result.length; i++)
            sb.append(result[i]).append("\n");

        System.out.println(sb);
    }
}