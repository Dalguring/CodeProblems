import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] A = sc.next().split("");
		String[] B = sc.next().split("");
		int a = 0; 
		int b = 0; 
		for(int i = A.length-1; i >= 0; i--) {
			a += Integer.parseInt(A[i])*(Math.pow(10, i));
		}
		
		for(int i = B.length-1; i >= 0; i--) {
			b += Integer.parseInt(B[i])*(Math.pow(10, i));
		}
		
		System.out.println(a > b ? a : b);
	}

}