import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int bucket = Integer.parseInt(st.nextToken());
		int changeCnt = Integer.parseInt(st.nextToken());
		Map<Integer, Integer> bucketMap = new LinkedHashMap<Integer, Integer>();
		List<Integer> dbList = new ArrayList<Integer>();
		int from = 0;
		int to = 0;
		int mid = 0;
		for(int i = 1; i <= bucket; i++) bucketMap.put(i, i);
		for(int i = 0; i < changeCnt; i++) {
			st = new StringTokenizer(br.readLine());
			from = Integer.parseInt(st.nextToken());
			to = Integer.parseInt(st.nextToken());
			mid = Integer.parseInt(st.nextToken());
			int cycle = 0;
			for(int j = mid; j <= to; j++) dbList.add(bucketMap.get(j));
			for(int j = from; j < mid; j++) dbList.add(bucketMap.get(j));
			for(int j = from; j <= to; j++) {
				bucketMap.put(j, dbList.get(cycle));
				++cycle;
			}
			dbList.clear();
		}
		br.close();
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= bucket; i++) sb.append(bucketMap.get(i)).append(" ");
		System.out.println(sb);
	}

}
