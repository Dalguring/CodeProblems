import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		str = str.replace("c=", "č");
		str = str.replace("c-", "ć");
		str = str.replace("dz=", "dž");
		str = str.replace("d-", "đ");
		str = str.replace("lj", "lj");
		str = str.replace("nj", "nj");
		str = str.replace("z=", "ž");
		str = str.replace("s=", "š");
		char[] chArr = str.toCharArray();
		int count = 0;
		
		try {
			for(int i = 0; i < chArr.length; i++) {
				if(chArr[i] == 'l' && chArr[i+1] == 'j') {
					continue;
				}
				
				if(chArr[i] == 'n' && chArr[i+1] == 'j') {
					continue;
				}
				
				if(chArr[i] == 'd' && chArr[i+1] == 'ž') {
					continue;
				}
				
				count++;
			}
		} catch (Exception e) {
			count++;
		}
		
		System.out.println(count);
	}

}
