import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int first = Integer.parseInt(br.readLine());
        String second = br.readLine();
        char[] secondCharArray = second.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = 2; i >= 0; i--) {
            sb.append(first * Character.getNumericValue(secondCharArray[i])).append("\n");
        }

        sb.append(first * Integer.parseInt(second));
        System.out.println(sb);
        
        br.close();
    }
}
