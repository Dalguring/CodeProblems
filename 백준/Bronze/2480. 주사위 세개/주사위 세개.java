import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		br.close();
		
		List<Integer> list = new ArrayList<Integer>();
		while(st.hasMoreTokens()) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		
		int checkNums = checkNums(list);
		System.out.println(calMoney(checkNums, list));
		
	}
	
	// 몇 개가 같은지 검사하는 메서드
	public static int checkNums(List<Integer> list) {
		int cnt = 1;
		if(list.get(0) == list.get(1)) {
			cnt++;
			if(list.get(0) == list.get(2)) {
				cnt++;
			}
		} else if(list.get(0) == list.get(2)) {
			cnt++;
		} else if(list.get(1) == list.get(2)) {
			cnt++;
		}
		return cnt;
	}
	
	// 같은 주사위 눈 갯수 받아서 상금 계산해주는 메서드
	public static int calMoney(int checkNums, List<Integer> list) {
		int money = 0;
		list.sort(Comparator.naturalOrder());
		switch (checkNums) {
		case 3: money = list.get(0)*1000 + 10000; break;
		case 2: money = list.get(1)*100 + 1000; break;
		case 1: money = list.get(2)*100; break;
		}
		
		return money;
	}
	
}
