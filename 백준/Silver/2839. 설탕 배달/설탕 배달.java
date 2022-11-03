import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int fCount = 0;
		int tCount = 0;
		
		for(int i = 0; i < N; i++) {
			if((N - 5*i) < 0) { break;}
			if((N - 5*i)%3 == 0) {
				fCount = i;
				tCount = (N - 5*i)/3;
			} 
		}
		if(fCount + tCount == 0) {
			System.out.println(-1);
		} else {
			System.out.println(fCount + tCount);
		}
		
	}

}
