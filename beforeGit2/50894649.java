import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] arr = new int[9][9];
		int max = 0;
		int line = 0;
		int index = 0;
		for(int i = 0; i < arr.length; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				max = max >= arr[i][j] ? max : arr[i][j];
				if(max == arr[i][j]) {
					line = i+1;
					index = j+1;
				}
			}
		}
		br.close();
		System.out.println(max);
		System.out.println(line + " " + index);
		
		
		
	}

}
