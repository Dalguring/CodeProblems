import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int i = 0; i < T; i++) {
			int k = sc.nextInt();
			int n = sc.nextInt();
			
			int[][] arr = new int[k+1][n];
			for(int j = 0; j < n; j++) {
				arr[0][j] = j+1;
			}
			
			
			for(int j = 1; j < k+1; j++) {
				for(int z = 0; z < n; z++) {
					for(int y = 0; y <= z; y++) {
						arr[j][z] += arr[j-1][y];
					}
				}
			}
			
			System.out.println(arr[k][n-1]);
		}
		
	}

}
