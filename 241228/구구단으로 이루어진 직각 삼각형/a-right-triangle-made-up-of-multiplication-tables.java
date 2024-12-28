import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                sb.append(i).append(" * ").append(j).append(" = ").append(i * j);
                if (j < n - i + 1) {
                    sb.append(" / ");
                }
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}