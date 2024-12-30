import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        
        int[][] board = new int[n][n];
        
        StringBuilder sb = new StringBuilder();

        int num = 1;
        for (int i = n - 1; i >= 0; i--) {
            if(i % 2 == 1) {
                for(int j = n - 1; j >= 0; j--) {
                    board[i][j] = num++;
                }
            } else {
                for(int j = 0; j < n; j++) {
                    board[i][j] = num++;
                }
            }
            
        }
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                sb.append(board[j][i]).append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}