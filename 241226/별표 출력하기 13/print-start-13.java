import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < 2 * n; i++) {
            if(i % 2 == 1) {
                for(int k = 0; k < 1 + i / 2; k++)
                    sb.append("* ");
            }
            else {
                for(int k = 0; k < n - i / 2; k++)
                    sb.append("* ");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}