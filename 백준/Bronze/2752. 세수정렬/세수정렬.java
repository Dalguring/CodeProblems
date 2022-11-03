import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		list.add(a);
		list.add(b);
		list.add(c);
		
		Collections.sort(list);
		StringBuilder sb = new StringBuilder();
		
		for(int i : list) {
			sb.append(i+" ");
		}
		System.out.println(sb.toString());
		
	}

}
