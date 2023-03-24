import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int bucket = Integer.parseInt(st.nextToken());
		int count = Integer.parseInt(st.nextToken());
		int trg1 = 0;
		int trg2 = 0;
		int cnt = 0;
		Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		for(int i = 1; i <= bucket; i++) map.put(i, i);
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < count; i++) {
			st = new StringTokenizer(br.readLine());
			trg1 = Integer.parseInt(st.nextToken());
			trg2 = Integer.parseInt(st.nextToken());
			for(int j = trg2; j >= trg1; j--) list.add(map.get(j));
			for(int j = trg1; j <= trg2; j++) {
				map.replace(j, list.get(cnt));
				++cnt;
			}
			list.clear();
			cnt = 0;
		}
		br.close();
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= bucket; i++) sb.append(map.get(i)).append(" ");
		System.out.println(sb);
	}

}
