import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        int num = 0;
        for(int i = 1; i < n + 1; i++) {
            
            for(int j = n; j > 0; j--) {
                if(i % 2 == 1) {
                    num++;
                    sb.append(num).append(" ");
                } else {
                    num+= 2;
                    sb.append(num).append(" ");
                }
            }
            
            sb.append("\n");
        }

        System.out.println(sb);
    }
}