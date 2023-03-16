import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int bucket = Integer.parseInt(st.nextToken());
		int tradeCount = Integer.parseInt(st.nextToken());
		int trg1;
		int trg2;
		
		for(int i = 1; i <= bucket; i++) map.put(i, i);
		for(int i = 0; i < tradeCount; i++) {
			st = new StringTokenizer(br.readLine());
			trg1 = Integer.parseInt(st.nextToken());
			trg2 = Integer.parseInt(st.nextToken());
			int tmp1 = map.get(trg1);
			int tmp2 = map.get(trg2);
			map.replace(trg1, tmp2);
			map.replace(trg2, tmp1);
		}
		br.close();
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= bucket; i++) {
			sb.append(map.get(i)).append(" ");
		}
		System.out.println(sb);
	}

}
