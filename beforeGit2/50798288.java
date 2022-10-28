import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		br.close();
		
		sb.append(A*B*C);
		int count = 0;
		int[] arr = new int[10];
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < sb.length(); j++) {
				if(sb.charAt(j)-48 == i) {
					count++;
				}
			}
			arr[i] = count;
			bw.write(arr[i]+"\n");
			bw.flush();
			count = 0;
		}
		
		bw.close();
	}

}
