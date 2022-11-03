import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] sentence = sc.nextLine().split(" ");
		int count = 0;
		for(String s : sentence) {
			if(s.equals("")) {
				continue;
			}
			count++;
		}
		System.out.println(count);
	}

}