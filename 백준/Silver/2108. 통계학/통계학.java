import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		br.close();
		
		System.out.println(getAver(arr));
		System.out.println(getMedian(arr));
		System.out.println(getMode(arr));
		System.out.println(getArrange(arr));
	}
	
	static int getAver(int[] arr) {
		int sum = 0;
		for(int i : arr) {
			sum += i;
		}
		
		return (int)Math.round((double)sum / arr.length);
	}
	
	static int getMedian(int[] arr) {
		Arrays.sort(arr);
		return arr[arr.length / 2];
	}
	
	static int getMode(int[] arr) {
		int[] index = new int[8001];
		int max = Integer.MIN_VALUE;
		
		for(int i = 0; i < arr.length; i++) {
			index[arr[i]+4000]++;
		}
		
		for(int i = 0; i < index.length; i++) {
			max = max > index[i] ? max : index[i]; 
		}
		
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		for(int i = 0; i < index.length; i++) {
			if(index[i] == max) arrList.add(i - 4000);
		}
		Collections.sort(arrList); // 최빈값들 모음
		if(arrList.size() == 1) {
			return arrList.get(0);
		} else {
			return arrList.get(1);
		}
	}
	
	static int getArrange(int[] arr) {
		int max = -4001;
		int min = 4001;
		for(int i : arr) {
			max = max > i ? max : i;
			min = min > i ? i : min;
		}
		
		return max - min;
	}
	
}
