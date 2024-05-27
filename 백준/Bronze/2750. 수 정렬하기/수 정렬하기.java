import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    private static int[] array;
    private static int N;
    private static BufferedReader br;
    
    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        array = new int[N];
        bubbleSort();

        for (int i : array) {
            sb.append(i).append("\n");
        }

        System.out.println(sb);
        br.close();
    }

    private static void getInput() throws IOException {
        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(br.readLine());
        }
    }

    private static void insertionSort() throws IOException {
        getInput();

        int exchange = 0;
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if (array[i] < array[j]) {
                    exchange = array[i];
                    array[i] = array[j];
                    array[j] = exchange;
                }
            }
        }
    }
    
    private static void bubbleSort() throws IOException {
        getInput();
        
        int exchange = 0;
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length - i; j++) {
                if (array[j] > array[j + 1]) {
                    exchange = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = exchange;
                }
            }
        }
    }
}