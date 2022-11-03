import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[][] A = new int[N][M];
		int[][] B = new int[N][M];

		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < A[i].length; j++) {
				A[i][j] = Integer.parseInt(st.nextToken()); 
			}
		}
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < B[i].length; j++) {
				B[i][j] = Integer.parseInt(st.nextToken()); 
			}
		}
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < B[i].length; j++) {
				bw.write(A[i][j] + B[i][j] + " ");
				bw.flush();
			}
			bw.write("\n");
			bw.flush();
		}
		
		bw.close();
		
	}

}
