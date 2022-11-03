import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		br.close();
		int sum = 0;
		List<Integer> list = new ArrayList<>();
		
		OUTER:
		for(int i = M; i <= N; i++) {
            if(i == 1) continue;
			for(int j = 2; j < i; j++) {
				if(i % j == 0) continue OUTER;
			}
			list.add(i);
			sum += i;
		}
		
		if(sum != 0) {
			System.out.println(sum);
			System.out.println(list.get(0));
		} else {
			System.out.println(-1);
		}
		
	}

}
