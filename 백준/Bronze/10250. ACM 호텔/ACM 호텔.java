import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		// TestCase T 입력받기
		int T = Integer.parseInt(br.readLine());
		
		// T만큼 반복하면서 각 케이스별로 H,W,N 입력 받기
		for(int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			int H = Integer.parseInt(st.nextToken());
			int W = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			// 호수 처리
			int[][]arr = new int[H][W];
			for(int j = 0; j < arr.length; j++) {
				for(int k = 0; k < arr[j].length; k++) {
					arr[j][k] = k+101+(j*100);
				}
			}
			
			// 사람 배정
			for(int j = 0; j < W; j++) {
				if(N <= H) {
					bw.write(arr[N-1][j] + "\n");
					break;
				} else {
					N -= H;
					continue;
				}
			}
			bw.flush();
		}
		bw.close();
	}
}