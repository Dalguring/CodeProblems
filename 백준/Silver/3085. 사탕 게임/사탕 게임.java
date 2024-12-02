import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    static char[][] candyBoard;
    static int maxCandies = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int board = Integer.parseInt(br.readLine());
        candyBoard = new char[board + 1][board + 1];
        int line = 0;
        int row = 0;

        for (int i = 0; i < board; i++) {
            char[] chars = br.readLine().toCharArray();

            for (int j = 0; j < board; j++) {
                candyBoard[i][j] = chars[j];
                candyBoard[board][j] = 'U';
            }
            candyBoard[i][board] = 'U';
        }

        while (line <= board - 1 && row <= board - 1) {
            char temp = candyBoard[line][row + 1];

            candyBoard[line][row + 1] = candyBoard[line][row];
            candyBoard[line][row] = temp;

            maxCandies = Math.max(maxCandies, getAsRow(row));
            maxCandies = Math.max(maxCandies, getAsRow(row + 1));
            maxCandies = Math.max(maxCandies, getAsLine(line));

            candyBoard[line][row] = candyBoard[line][row + 1];
            candyBoard[line][row + 1] = temp;

            temp = candyBoard[line + 1][row];

            candyBoard[line + 1][row] = candyBoard[line][row];
            candyBoard[line][row] = temp;

            maxCandies = Math.max(maxCandies, getAsLine(line));
            maxCandies = Math.max(maxCandies, getAsLine(line + 1));
            maxCandies = Math.max(maxCandies, getAsRow(row));

            candyBoard[line][row] = candyBoard[line + 1][row];
            candyBoard[line + 1][row] = temp;

            row++;

            if (row >= board - 1) {
                row = 0;
                line++;
            }
        }

        System.out.println(maxCandies);
        br.close();
    }

    static int getAsLine(int line) {
        Stack<Character> characterStack = new Stack<>();
        int max = 0;

        for (int i = 0; i < candyBoard.length; i++) {
            int count = 0;

            while (!characterStack.isEmpty() && candyBoard[line][i] != characterStack.peek()) {
                characterStack.pop();
                count++;
            }

            max = Math.max(max, count);
            if (candyBoard[line][i] != 'U') {
                characterStack.push(candyBoard[line][i]);
            }
        }

        return Math.max(max, characterStack.size());
    }

    static int getAsRow(int row) {
        Stack<Character> characterStack = new Stack<>();
        int max = 0;

        for (int i = 0; i < candyBoard.length; i++) {
            int count = 0;

            while (!characterStack.isEmpty() && candyBoard[i][row] != characterStack.peek()) {
                characterStack.pop();
                count++;
            }

            max = Math.max(max, count);
            if (candyBoard[i][row] != 'U') {
                characterStack.push(candyBoard[i][row]);
            }
        }

        return Math.max(max, characterStack.size());
    }
}
