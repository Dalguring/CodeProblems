import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static int save;
    private static int[] merArray;
    private static int cycle = 0;
    private static int saveNumber = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int arrayLength = Integer.parseInt(st.nextToken());
        save = Integer.parseInt(st.nextToken());
        merArray = new int[arrayLength];
        int[] array = new int[arrayLength];

        st = new StringTokenizer(br.readLine());
        br.close();

        for (int i = 0; i < arrayLength; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        merge_sort(array, 0, array.length - 1);

        if (saveNumber == 0) {
            System.out.println(-1);
        } else {
            System.out.println(saveNumber);
        }
    }

    static void merge_sort(int[] array, int start, int end) {
        if (start == end) {
            return;
        }
        int mid = (start + end) / 2;

        merge_sort(array, start, mid);
        merge_sort(array, mid + 1, end);

        merge(array, start, mid, end);
    }

    static void merge(int[] array, int start, int mid, int end) {
        int left = start;
        int right = mid + 1;
        int index = start;

        while (left <= mid && right <= end) {
            if (array[left] <= array[right]) {
                merArray[index++] = array[left++];
            } else {
                merArray[index++] = array[right++];
            }
            save(index - 1);
        }

        if (left > mid) {
            while (right <= end) {
                merArray[index++] = array[right++];
                save(index - 1);
            }
        } else {
            while (left <= mid) {
                merArray[index++] = array[left++];
                save(index - 1);
            }
        }

        for (int i = start; i <= end; i++) {
            array[i] = merArray[i];
        }
    }

    static void save(int index) {
        cycle++;
        if (cycle == save) {
            saveNumber = merArray[index];
        }
    }
}
