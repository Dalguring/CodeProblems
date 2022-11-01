import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

// 메서드 분리하여 풀어보기
public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		br.close();
		int H = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] time = newTime(H, M);
		System.out.println(time[0] + " " + time[1]);
	}
	
	public static int[] newTime(int H, int M) {
		int[] time = new int[2];
		if(M >= 45) {
			time[0] = H;
			time[1] = M-45;
		} else if(H == 0 && M < 45) {
			time[0] = 23;
			time[1] = M+15;
		} else if(M < 45) {
			time[0] = H-1;
			time[1] = M+15;
		}
		return time;
	}

}
