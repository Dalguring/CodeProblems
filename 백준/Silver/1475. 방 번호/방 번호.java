import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String number = br.readLine();
        
        int[] count = new int[10];
        
        for (char c : number.toCharArray()) {
            int digit = Character.getNumericValue(c);
            count[digit]++;
        }
        
        int sixNineCount = count[6] + count[9];
        count[6] = (sixNineCount + 1) / 2;  
        count[9] = 0;
        
        int maxSet = 0;
        for (int i = 0; i < 9; i++) { 
            maxSet = Math.max(maxSet, count[i]);
        }
        
        System.out.println(maxSet);
        
        br.close();
    }
}
