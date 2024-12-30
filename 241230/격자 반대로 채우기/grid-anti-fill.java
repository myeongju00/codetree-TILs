import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int[][] board = new int[n][n];
        int num = 1;

        for (int j = n - 1; j >= 0; j--) {
            if ((n - j) % 2 == 1) {
                for (int i = n - 1; i >= 0; i--) {
                    board[i][j] = num++;
                }
            } else {
                for (int i = 0; i < n; i++) {
                    board[i][j] = num++;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sb.append(board[i][j]).append(" ");
            }
            sb.append("\n");
        }

        System.out.print(sb);
    }
}