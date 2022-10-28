import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		int N = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			arr.add(Integer.parseInt(st.nextToken()));
		}
		int v = Integer.parseInt(br.readLine());
		
		int cnt = 0;
		for(int i : arr) {
			if(i == v) {
				cnt++;
			}
		}
		
		bw.write(cnt+"\n");
        bw.flush();
        bw.close();
	}

}
