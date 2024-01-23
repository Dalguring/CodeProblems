import java.io.*;
import java.util.*;

public class Main {
    static boolean[][] chessMap;
    static int min = 64;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int width = Integer.parseInt(st.nextToken());
        int height = Integer.parseInt(st.nextToken());
        chessMap = new boolean[width][height];

        for (int i = 0; i < width; i++) {
            String chessRow = br.readLine();
            for (int j = 0; j < height; j++) {
                if (chessRow.charAt(j) == 'W')
                    chessMap[i][j] = true;
            }
        }

        for (int i = 0; i < width - 7; i++) {
            for (int j = 0; j < height - 7; j++) {
                getMinPaintedCount(i, j);
            }
        }

        System.out.println(min);
        br.close();
    }

    static void getMinPaintedCount (int row, int col) {
        int count = 0;
        boolean color = chessMap[row][col];

        for (int i = row; i < row + 8; i++) {
            for (int j = col; j < col + 8; j++) {
                if (chessMap[i][j] != color) {
                    count++;
                }
                color = !color;
            }
            color = !color;
        }

        count = Math.min(count, 64 - count);
        min = Math.min(count, min);
    }
}
