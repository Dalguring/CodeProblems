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
		int cnt = 0;
		OUTER:
		for(int i = 0; i < N; i++) {
			boolean[] check = new boolean[26];
			String target = br.readLine();
			int prev = 0;
			for(int j = 0; j < target.length(); j++) {
				if(prev != target.charAt(j)) {
					if(check[target.charAt(j) - 'a'] == false) {
						check[target.charAt(j) - 'a'] = true;
						prev = target.charAt(j);
					}
					else {continue OUTER;}
				}
			}
			cnt++;
		}
		
		System.out.println(cnt);
		
		
	}

}
