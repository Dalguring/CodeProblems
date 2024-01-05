import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int target = Integer.parseInt(br.readLine());
        int answer = 0;
        
        for (int i = target - 9 * String.valueOf(target).length(); i < target; i++) {
            int accum = 0;
            for (int j = 0; j < String.valueOf(i).length(); j++) {
                accum += Character.getNumericValue(String.valueOf(i).charAt(j));
            }
            
            if (i + accum == target) {
                answer = i;
                break;
            }
        }
        System.out.println(answer);
        br.close();
    }
}
