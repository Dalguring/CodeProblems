import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]arr = new int[10];
        int count = 1;
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt()%42;
        }
        for(int i = 0; i < arr.length-1; i++) {
        	int index = arr[i];
        	for(int j=i+1; j < arr.length; j++) {
        		if(index == arr[j]) {
        			count--;
        			break;
        		}
        		
        	}
        	count++;
        }
        System.out.println(count);
    }
}