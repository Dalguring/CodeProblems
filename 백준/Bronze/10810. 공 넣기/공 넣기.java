import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int bucket = Integer.parseInt(st.nextToken());
		int cycle = Integer.parseInt(st.nextToken());
		int first = 0;
		int last = 0;
		int ballNum = 0;
		
		for(int i = 1; i <= bucket; i++) map.put(i, 0);
		for(int i = 0; i < cycle; i++) {
			st = new StringTokenizer(br.readLine());
			first = Integer.parseInt(st.nextToken());
			last = Integer.parseInt(st.nextToken());
			ballNum = Integer.parseInt(st.nextToken());
			for(int j = first; j <= last; j++) {
				map.put(j, ballNum);
			}
		}
		br.close();
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= bucket; i++) {
			sb.append(map.get(i)+" ");
		}
		System.out.println(sb.toString());
	}

}
