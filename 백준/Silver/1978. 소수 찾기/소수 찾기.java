import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int cnt = 0;
		
		for(int i = 0; i < N; i++) {
			int a = Integer.parseInt(st.nextToken());
			if(a == 1) continue;
			int count = 2;
			for(int j = 2; j < a; j++) {
				if(a % j != 0) continue;
				count++;
			}
			if(count == 2) cnt++;
		}
		
		bw.write(cnt+"");
		bw.flush();
		bw.close();
		
	}

}
