import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int count = 0; 
        int position = 0; 

        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (num == 2) {
                count++;
                if (count == 3) {
                    position = i; 
                    break;
                }
            }
        }

        System.out.println(position);
    }
}