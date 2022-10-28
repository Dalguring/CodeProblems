import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		for(int i = 1; i <= 30; i++) {
			list.add(i);
		}
		for(int i = 0; i < 28; i++) {
			int target = list.indexOf(sc.nextInt());
			list.remove(target);
		}
		
		list.sort((o1, o2) -> o1-o2);;
		for(int i : list) {
			System.out.println(i);
		}
	
		
	}

}
