import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int[] arr2 = {1, 1, 2, 2, 2, 8};
        for(int i = 0; i < arr2.length; i++) {
            arr2[i] = arr2[i] - arr[i];
            System.out.print(arr2[i] + " ");
        }
    }
}