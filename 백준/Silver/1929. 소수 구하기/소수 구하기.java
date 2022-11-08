import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int M = Integer.parseInt(st.nextToken());		
		int N = Integer.parseInt(st.nextToken());
		List<Integer> list = new ArrayList<>();
		
		for(int i = M; i <= N; i++ ) {
			boolean prN = isPrime(i);
			if(prN) list.add(i);
		}
		for(int i : list) {
			bw.write(i+"\n");
			bw.flush();
		}
		
		bw.close();
		br.close();
		
	}
	
	public static boolean isPrime(int num) {
		boolean prN = false;
		if(num == 1) return false;
		if(num == 2) return true;
		for(int i = 2; i <= Math.sqrt(num); i++) {
			if(num % i == 0) return false;
		}
		prN = true;
		return prN;
	}

}
