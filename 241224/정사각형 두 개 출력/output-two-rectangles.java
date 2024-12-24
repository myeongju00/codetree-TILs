import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        
        int count = 0;
        while (count < 2) {
            for(int i = 0; i < n; i++) {
                for(int  j = 0; j < n; j++) {
                    sb.append("*");
                }
                sb.append("\n");
            }
            sb.append("\n");
            count++;
        }

        System.out.println(sb);
    }
}