import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for(int i = n; i > 0; i--) {
            
            for(int j = i; j < n + 1; j++) {
                sb.append(j).append(" ");
            }
            
            sb.append("\n");
        }

        System.out.println(sb);
    }
}