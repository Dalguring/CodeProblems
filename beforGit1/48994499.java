import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		str = str.toUpperCase();
		char[] ch = str.toCharArray();
		sc.close();
		int[] arr = new int[26];
		for(int i = 0; i < ch.length; i++) {
			int index = ch[i]-65;
			arr[index] += 1;
		}
		
		int max = 0, index = 0, count = 0;
		for(int i = 0; i < arr.length; i++) { max = Math.max(max, arr[i]); }
		for(int i = 0; i < arr.length; i++) {
			if(max == arr[i]) {
				index = i;
				count++;
			}
		}
		if(count > 1) {System.out.println("?");}
        else {System.out.println((char)(index+65));}
	}
}
