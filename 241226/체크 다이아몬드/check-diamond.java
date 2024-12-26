import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        
        for(int i = 1; i < n; i++) {
            for(int j = n; j > i; j--) {
                sb.append(" ");
            }
            for(int j = 0; j < i; j++) {
                sb.append("*").append(" ");
            }            
            sb.append("\n");
        }
        for(int i = n; i > 0; i--) {
            for(int j = n; j > i; j--) {
                sb.append(" ");
            }
            for(int j = 0; j < i; j++) {
                sb.append("*").append(" ");
            }            
            sb.append("\n");
        }

        System.out.println(sb);
    }
}