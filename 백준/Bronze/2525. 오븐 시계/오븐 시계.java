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
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(br.readLine());
		br.close();
		
		int hours = (B+C) / 60;
		int mins = (B+C) % 60;
		
		if(hours == 0) {
			bw.write(A + " " + mins);
		} else if(hours >= 1 && A + hours >= 24) {
			bw.write(A+hours-24 + " " + mins);
		} else {
			bw.write(A+hours + " " + mins);
		}
		
		bw.flush();
		bw.close();
		
	}

}
