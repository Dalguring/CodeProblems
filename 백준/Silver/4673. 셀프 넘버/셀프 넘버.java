import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		d(10000);
	}
	public static void d(int num) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int i2 = 0;
		for(int i = 1; i <= num; i++) {
			i2 = i+(i/1000)+((i/100)%10)+((i/10)%10)+(i%10);
			arr.add(i2);
		}
		
		for(int i = 1; i <= num; i++) {
			if(arr.contains(i)) {
				continue;
			} else {
				System.out.println(i);
			}
		}
	}
}