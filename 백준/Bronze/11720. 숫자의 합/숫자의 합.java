import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		String[] sArr = new String[i];
		sArr = sc.next().split("");
		int[] arr = new int[sArr.length]; 
		for(int j = 0; j < sArr.length; j++) {
			arr[j] = Integer.parseInt(sArr[j]);
		}
		int total=0;
		for(int j = 0; j < sArr.length; j++) {
			total += arr[j];
		}
		System.out.println(total);
	}
}