import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	        int H = sc.nextInt();
	        int M = sc.nextInt();
	        if(H == 0 && M < 45) {
	            H=23;
	            M=M+60-45;
	        } else if(M < 45) {
	            H-=1;
	            M=M+60-45;
	        } else {
	        	M-=45;
	        }
        System.out.print(H + " " + M);
        
    }
}